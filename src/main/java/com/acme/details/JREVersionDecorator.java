package com.acme.details;
/**
 * Decorator that adds the JRE version information to the server status description.
 * Adds 19 to the request cost.
 */
public class JREVersionDecorator extends AbstractStatusDetailDecorator {
    public JREVersionDecorator(StatusDetailInterface status){
        super(status);
    }

    @Override
    public String getEnglishText() {
        return super.getEnglishText()+", and the JRE version is "+Runtime.version();
    }

    @Override
    public int getCost() {
        return super.getCost()+19;
    }
}
