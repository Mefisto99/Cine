package com.ucbcba.demo.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {

    public static ResponseEntity<String> getResponse(Object object) {
        String response;
        HttpStatus status = HttpStatus.OK;
        if (object != null) {
          response = "{\"status\": \"success\"" +
                  ",\"data\": " + object.toString() + "}";
        } else {
            status = HttpStatus.BAD_REQUEST;
            response = "{\"status\": \"error\"" +
                    ", \"data\": {\"message\": \"No se ejecuto la transaccion\"}}";
        }
        return new ResponseEntity<>(response, status);
    }
    public static ResponseEntity<String> getResponse(boolean success) {
        String response;
        HttpStatus status = HttpStatus.OK;
        if (success) {
            response = "{\"status\": \"success\"" +
                    ",\"data\": {\"message\": \"Se ejecuto la transaccion\"}}";
        } else {
            status = HttpStatus.BAD_REQUEST;
            response = "{\"status\": \"error\"" +
                    ",\"data\": {\"message\": \"No se ejecuto la transaccion\"}}";
        }
        return new ResponseEntity<>(response, status);
    }

}
