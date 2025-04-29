package com.acme.details;

/**
 * Fake Object for testing that will use fake fixed values
 */
public class MockDetailsFacade implements DetailsFacadeInterface {
    @Override
    public int getAvailableProcessors() {
        return 4;
    }
    @Override
    public long getFreeJVMMemory() {
        return 127268272L;
    }
    @Override
    public long getTotalJVMMemory() {
        return 159383552L;
    }
    @Override
    public String getJREVersion() {
        return "15.0.2+7-27";
    }
    @Override
    public String getTempLocation() {
        return "M:\\AppData\\Local\\Temp";
    }
}
