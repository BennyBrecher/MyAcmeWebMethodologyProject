package com.acme.details;
/**
 * Defines behavior for any server status component.
 * Must provide status description text and cost.
 */
public interface StatusDetailInterface {
    String getEnglishText();
    int getCost();
}