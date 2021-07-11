package twsjava.samples.examples.dnhedge;

import twsjava.lib.client.Order;
import twsjava.lib.client.OrderType;
import twsjava.lib.client.Types.Action;
import twsjava.lib.client.Types.VolatilityType;

public class DNHedgeOrder extends Order {
   public DNHedgeOrder(int clientId, int id, int size, String account,
      String settlingFirm, int underConId, String designatedLocation) {
      clientId(clientId);
      orderId(id);
      permId(id);

      account(account);
      clearingIntent("AWAY");
      settlingFirm(settlingFirm);

      orderType(OrderType.VOL);
      action(Action.BUY);
      totalQuantity(size);

      volatility(0.1);
      volatilityType(VolatilityType.Daily);
      continuousUpdate(1);
      deltaNeutralOrderType(OrderType.LMT);

      deltaNeutralConId(underConId);
      deltaNeutralOpenClose("O");
      deltaNeutralShortSale(true);

      deltaNeutralDesignatedLocation(designatedLocation);
      deltaNeutralShortSaleSlot(deltaNeutralDesignatedLocation().length() == 0 ? 1 : 2);
   }
}
