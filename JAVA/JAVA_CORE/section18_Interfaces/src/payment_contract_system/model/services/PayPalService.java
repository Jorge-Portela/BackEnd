package payment_contract_system.model.services;

public class PayPalService implements OnlinePaymentService{

    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    public Double interest(Double amount, int months) {
        return amount * 0.01 * months;
    }
}
