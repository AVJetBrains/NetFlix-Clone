package com.example.SpringBoot;

import com.example.SpringBoot.Service.Streaming;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WatchList {
    private Streaming streaming;
    private String Name;

    public WatchList(Streaming streaming , String Name){
        this.streaming = streaming;
        this.Name = Name;
    }

    public void Store(String Name){

        HashMap<Integer , String> map = new HashMap<>();

        for(int i =0 ; i<Name.length() ; i++){
            map.put(i , Name);
            System.out.println(map);
        }
    }
}
