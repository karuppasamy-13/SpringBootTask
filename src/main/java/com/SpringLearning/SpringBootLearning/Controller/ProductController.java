package com.SpringLearning.SpringBootLearning.Controller;
import com.SpringLearning.SpringBootLearning.Model.ProductModel;
import com.SpringLearning.SpringBootLearning.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/check")
    public String checkPostMethod() {
        return productService.checkPostmethodResponse();
    }
    @PostMapping("/add")
    public String addProduct(@RequestBody ProductModel product) {
        return productService.addProductResponse(product);
    }
}

