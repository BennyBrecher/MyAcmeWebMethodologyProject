package com.acme.details;
/**
 * Decorator that adds the server's temp file location to the server status description.
 * Adds 29 to the request cost.
 */
public class TempLocationDecorator extends AbstractStatusDetailDecorator {
    public TempLocationDecorator(StatusDetailInterface status){
        super(status);
    }

    @Override
    public String getEnglishText() {
        return super.getEnglishText()+", and the server's temp file location is "+facade.getTempLocation();
    }

    @Override
    public int getCost() {
        return super.getCost()+29;
    }
}
