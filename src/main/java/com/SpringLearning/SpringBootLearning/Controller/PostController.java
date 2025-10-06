package com.SpringLearning.SpringBootLearning.Controller;

import com.SpringLearning.SpringBootLearning.Model.ProductModel;
import com.SpringLearning.SpringBootLearning.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class PostController {
    @Autowired
    private ProductService pcobj;
    @PostMapping("connectionChecking")
    public String checkingPostMethod(){
        return this.pcobj.checkPostmethodResponse();
    }
    @PostMapping("addProduct")
    public String addProduct(
            @RequestBody ProductModel product
    ){
        return this.pcobj.addProductResponse(product);
    }




}
