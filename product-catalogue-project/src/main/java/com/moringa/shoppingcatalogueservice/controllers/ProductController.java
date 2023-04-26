package com.moringa.shoppingcatalogueservice.controllers;

import com.moringa.productcatalogueproject.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/{productId}")
   public Product getProductById(@PathVariable String productId){
        return new Product(productId,"Maziwa",45.45);

   }

}
