package com.acme.details;
/**
 * Decorator that adds the amount of free JVM memory to the server status description.
 * Adds 7 to the request cost.
 */
public class FreeJVMMemoryDecorator extends AbstractStatusDetailDecorator {
    public FreeJVMMemoryDecorator(StatusDetailInterface status){
        super(status);
    }
    @Override
    public String getEnglishText() {
        return super.getEnglishText()+", and there are "+Runtime.getRuntime().freeMemory()+" bytes of JVM memory free";
    }

    @Override
    public int getCost() {
        return super.getCost()+7;
    }
}
