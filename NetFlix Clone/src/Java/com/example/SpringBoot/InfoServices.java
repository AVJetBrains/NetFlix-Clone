package com.example.SpringBoot;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.example.SpringBoot.Exception.MovienotfoundException;
import org.springframework.context.annotation.Configuration;


@Configuration
public class InfoServices {
    public static HttpResponse<String> getInformation(String Name) throws MovienotfoundException, UnirestException {
     if(Name.length() < 2){
        throw new MovienotfoundException(Name);
     }
        HttpResponse<String> response = Unirest.get("https://imdb8.p.rapidapi.com/auto-complete?q=suits")
                .header("x-rapidapi-host", "imdb8.p.rapidapi.com")
                .header("x-rapidapi-key", "0b6e28a197mshf3136520fe48378p112732jsn8fb07fbd35d8")
                .asString();

     return response;
    }
}
