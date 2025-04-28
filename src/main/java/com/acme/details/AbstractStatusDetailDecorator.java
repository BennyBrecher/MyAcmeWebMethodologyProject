package com.acme.details;
/**
 * Base class for all server status decorators.
 * Stores the previous status layer and lets subclasses add new status details and costs.
 */
public abstract class AbstractStatusDetailDecorator implements StatusDetailInterface{
    protected final StatusDetailInterface prev;
    public AbstractStatusDetailDecorator(StatusDetailInterface prev){
        this.prev = prev;
    }
    @Override
    public String getEnglishText() {
        return prev.getEnglishText();
    }

    @Override
    public int getCost() {
        return prev.getCost();
    }
}
