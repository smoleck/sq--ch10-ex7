package sq_ch10_ex7.services;

import org.springframework.stereotype.Service;
import sq_ch10_ex7.DTO.PaymentDetails;
import sq_ch10_ex7.exceptions.NotEnoughMoneyException;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
