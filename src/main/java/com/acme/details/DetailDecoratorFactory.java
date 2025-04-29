package com.acme.details;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * removed big awkward switch statement from statuscontroller into its own simple factory making statuscontroller more ocp compliant
 */
public class DetailDecoratorFactory {
    public static StatusDetailInterface decorateWithDetail(String detail, StatusDetailInterface currentStatus){
        switch(detail){
            case "availableProcessors": return new AvailableProcessorsDecorator(currentStatus);
            case "freeJVMMemory": return new FreeJVMMemoryDecorator(currentStatus);
            case "totalJVMMemory": return new TotalJVMMemoryDecorator(currentStatus);
            case "jreVersion": return new JREVersionDecorator(currentStatus);
            case "tempLocation": return new TempLocationDecorator(currentStatus);
            default: throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid details option: " + detail);
        }
    }
}
