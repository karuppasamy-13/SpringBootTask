package com.SpringLearning.SpringBootLearning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class URLWebAnnotations {


    @GetMapping
    public String getEndpointcheck(){

        return "GET launched Successfully";
    }

    @GetMapping("tickets")
    public String getTickets(){

        return "Collect your tickets at the box office";
    }

    @GetMapping("tickets/{seatNo}")
    public int searchSeatNo(){

        return  13;
    }

    @GetMapping("tickets/{seatNo}/{moviename}")
    public String searchMovie(){

        return "Latest Releases of this month : Idly Kadai,Kantara";

    }

}
