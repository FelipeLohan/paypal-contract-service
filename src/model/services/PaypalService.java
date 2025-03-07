package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        return amount + (0.1 * amount);
    }

    @Override
    public Double interest(Double amount, Integer months){
        return 0.0;
    }
}
