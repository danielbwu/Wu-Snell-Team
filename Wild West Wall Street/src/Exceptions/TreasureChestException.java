/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author 1dani
 */
public class TreasureChestException extends Exception{

    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    public TreasureChestException() {
    }

    public TreasureChestException(String message) {
        this.errorMessage = message;
    }

    public TreasureChestException(String message, Throwable cause) {
        super(message, cause);
    }

    public TreasureChestException(Throwable cause) {
        super(cause);
    }

    public TreasureChestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
