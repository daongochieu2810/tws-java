package twsjava.lib.client;

import java.util.List;

public interface ContractLookuper {
	List<ContractDetails> lookupContract(Contract contract);
}
