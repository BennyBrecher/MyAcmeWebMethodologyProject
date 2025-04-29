package com.acme.details;

/**
 * this interface defines all methods our facade will use to retrieve lower level data
 */
public interface DetailsFacadeInterface {
    int getAvailableProcessors();
    long getFreeJVMMemory();
    long getTotalJVMMemory();
    String getJREVersion();
    String getTempLocation();
}
