package model.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        return 0.2 * amount;
    }

    @Override
    public Double interest(Double amount, Integer months){
        double result = 0;
        for (int i = 0; i < months; i++){
            result += amount * 0.01;
        }

        return result;
    }
}
