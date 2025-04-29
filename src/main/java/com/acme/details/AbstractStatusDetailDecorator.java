package com.acme.details;
/**
 * Base class for all server status decorators.
 * Stores the previous status detail layer and lets subclasses add new status details and costs.
 * updated to have all decorators now access info via the details facade with ability to inject any mock facade as well
 */
public abstract class AbstractStatusDetailDecorator implements StatusDetailInterface{

    protected static DetailsFacadeInterface facade = new DetailsFacadeConcrete();

    public static void setFacade(DetailsFacadeInterface newFacade){
        facade = newFacade;
    }

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
