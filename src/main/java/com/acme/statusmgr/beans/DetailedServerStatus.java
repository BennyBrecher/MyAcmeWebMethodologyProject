package com.acme.statusmgr.beans;

import com.acme.details.StatusDetailInterface;

/**
 * A POJO that represents a detailed Server Status with extra information.
 * Uses a decorated chain of status components to dynamically build the status description and cost.
 */

public class DetailedServerStatus extends ServerStatus{
    private final StatusDetailInterface decorated;

    public DetailedServerStatus(long id, String contentHeader, StatusDetailInterface decorated) {
        super(id, contentHeader);
        this.decorated = decorated;
    }

    public String getStatusDesc() {
        return decorated.getEnglishText();
    }

    public Integer getRequestCost() {
        return decorated.getCost();
    }
}