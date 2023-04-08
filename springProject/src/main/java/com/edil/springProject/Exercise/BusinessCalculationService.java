package com.edil.springProject.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Component
public class BusinessCalculationService {

    private DataService dataService;
    @Autowired
    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService = dataService;
    }
        public int findMax(){
       return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }


}
