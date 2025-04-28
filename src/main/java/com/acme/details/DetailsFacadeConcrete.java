package com.acme.details;

/**
 * this implementation of our facade allows us to supply all decorators with their
 * required low level data without having them handle the responsibility of retrieval
 */
public class DetailsFacadeConcrete implements DetailsFacadeInterface {
    @Override
    public int getAvailableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public long getFreeJVMMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public long getTotalJVMMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public String getJREVersion() {
        return Runtime.version().toString();
    }

    @Override
    public String getTempLocation() {
        return System.getenv("TEMP");
    }
}
