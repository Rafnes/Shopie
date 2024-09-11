package pro.sky.Shopie.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidItemIdException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Некорректный ID товара";

    public InvalidItemIdException() {
        super(DEFAULT_MESSAGE);
    }
}
