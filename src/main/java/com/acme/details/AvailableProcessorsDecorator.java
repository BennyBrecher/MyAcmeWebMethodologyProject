package com.acme.details;

/**
 * Decorator that adds the number of available processors to the server status description.
 * Adds 3 to the request cost.
 */
public class AvailableProcessorsDecorator extends AbstractStatusDetailDecorator {

    public AvailableProcessorsDecorator(StatusDetailInterface status){
        super(status);
    }

    @Override
    public String getEnglishText() {
        return super.getEnglishText()+ ", and there are " + Runtime.getRuntime().availableProcessors() + " processors available";
    }

    @Override
    public int getCost() {
        return super.getCost()+3;
    }
}
