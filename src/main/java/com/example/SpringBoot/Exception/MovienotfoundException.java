package com.example.SpringBoot.Exception;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MovienotfoundException extends Exception{

    private String Name;

    public MovienotfoundException(String Name){
        this.Name = Name;
    }

    LogManager logManager = LogManager.getLogManager();

    Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);


    @Override
    public String getMessage(){
           logger.log(Level.INFO , "MovienotfoundException");
           return "Movie = "+ Name + "Not Found";
    }
}
