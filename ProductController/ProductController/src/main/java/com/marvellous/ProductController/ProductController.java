package com.marvellous.ProductController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController
{
    // GET : /products (hardcoded list)
    @GetMapping("/products")
    public List<String> getProducts()
    {
        return Arrays.asList("Laptop", "Mobile", "Tablet");
    }

    // POST : /products -> return "Product created"
    @PostMapping("/products")
    public ResponseEntity<String> createProduct()
    {
        return new ResponseEntity<>("Product created", HttpStatus.CREATED);
    }

    // PUT : /products/{id} -> update message
    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id)
    {
        return new ResponseEntity<>("Product updated with id : " + id, HttpStatus.OK);
    }

    //    DELETE : /products/{id} -> delete message
    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id)
    {
        return new ResponseEntity<>("Product deleted with id : "+id, HttpStatus.OK);
    }
}
