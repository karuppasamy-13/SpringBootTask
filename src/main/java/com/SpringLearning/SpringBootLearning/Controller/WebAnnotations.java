package com.SpringLearning.SpringBootLearning.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebAnnotations {
    @GetMapping
    public String getExample(){

        return "FSD Course will be going to end";
    }

    @PostMapping
    public String postExample(){
        return "Result for Post API : Good Bye!!";
    }

    @PutMapping
    public String putExample(){
        return "Put Mapping is Triggered here!!!";
    }

    @DeleteMapping
    public String deleteExample(){

        return "Delete all the data ";
    }

    @PatchMapping
    public String patchExample(){

        return "Patch the new data with the existing data";
    }
}

