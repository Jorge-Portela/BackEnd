package payment_contract_system.model.services;

public interface OnlinePaymentService {
    Double paymentFee (Double amount);
    Double interest (Double amount, int months);
}
