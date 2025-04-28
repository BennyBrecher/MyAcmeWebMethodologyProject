package com.acme.details;
/**
 * Base class for all server status decorators.
 * Stores the previous status detail layer and lets subclasses add new status details and costs.
 * updated to have all decorators now access info via the details facade
 */
public abstract class AbstractStatusDetailDecorator implements StatusDetailInterface{
    protected final DetailsFacadeInterface facade = new DetailsFacadeConcrete();
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
