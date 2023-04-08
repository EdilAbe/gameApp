package com.edil.springProject.Exercise;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongodbDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{4, 14, 21, 26};
    }
}
