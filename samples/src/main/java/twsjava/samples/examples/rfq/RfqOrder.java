package twsjava.samples.examples.rfq;

import twsjava.lib.client.Order;
import twsjava.lib.client.OrderType;

public class RfqOrder extends Order {

   public RfqOrder(int clientId, int id, int size) {

      clientId(clientId);
      orderId(id);
      permId(id);
      totalQuantity(size);
      orderType(OrderType.QUOTE);

      /*
       * Note: this will be overridden by the backend
       *       because it could not keep such order
       *       (and it does not make too much sense)
       */
      transmit(false);
   }
}

