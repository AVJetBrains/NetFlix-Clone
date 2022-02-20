package com.example.SpringBoot;

import com.example.SpringBoot.Response.model.Information;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.example.SpringBoot.Exception.MovienotfoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController{
     @Autowired
     private InfoServices infoServices;

     @GetMapping("Movie/{Name}")
     public ResponseEntity<Information> index(@PathVariable("Name") String Name) throws UnirestException {
          try {
               HttpResponse<String> unirestResponse = InfoServices.getInformation("Name");
               String result = unirestResponse.getBody();

               Information information = new Information(Name);
               return ResponseEntity.status(unirestResponse.getStatus()).body(information);
          }
          catch(MovienotfoundException ex){
                return ResponseEntity.badRequest().build();
          }
     }




}
