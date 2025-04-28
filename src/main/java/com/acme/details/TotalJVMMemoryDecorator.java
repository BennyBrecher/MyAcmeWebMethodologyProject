package com.acme.details;
/**
 * Decorator that adds the total JVM memory available to the server status description.
 * Adds 13 to the request cost.
 */
public class TotalJVMMemoryDecorator extends AbstractStatusDetailDecorator {
    public TotalJVMMemoryDecorator(StatusDetailInterface status){
        super(status);
    }
    @Override
    public String getEnglishText() {
        return super.getEnglishText()+", and there is a total of "+ facade.getTotalJVMMemory() +" bytes of JVM memory";
    }

    @Override
    public int getCost() {
        return super.getCost()+13;
    }
}
