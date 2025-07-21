package sq_ch10_ex7.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import sq_ch10_ex7.DTO.ErrorDetails;
import sq_ch10_ex7.exceptions.NotEnoughMoneyException;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoney(NotEnoughMoneyException e) {
        ErrorDetails errorDetails = new ErrorDetails("Not enough money to make the payment.");
        return ResponseEntity
                .badRequest() // HTTP 400 Bad Request
                .body(errorDetails);
    }
}
