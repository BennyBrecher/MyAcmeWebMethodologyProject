package com.acme.details;
/**
 * Basic starting status detail that represents "Server is up" with a base cost of 1.
 * Used as the starter component in the decorator chain.
 */
public class BasicUndecoratedStatus implements StatusDetailInterface {
    @Override
    public String getEnglishText() {
        return "Server is up";
    }

    @Override
    public int getCost() {
        return 1;
    }
}
