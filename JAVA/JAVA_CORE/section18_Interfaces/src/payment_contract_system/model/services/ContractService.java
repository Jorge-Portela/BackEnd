package payment_contract_system.model.services;

import payment_contract_system.entities.Contract;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;

    }
    public void processContract(Contract contract, int months){
        
    }

}
