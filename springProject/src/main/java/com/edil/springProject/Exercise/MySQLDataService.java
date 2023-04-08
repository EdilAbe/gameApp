package com.edil.springProject.Exercise;


import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData(){
        return new int[] {45, 54, 98, 88};
    }


}
