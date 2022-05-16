package br.dev.spring.demo.auth.controller;

import br.dev.spring.demo.auth.model.Product;
import br.dev.spring.demo.auth.service.ProductService;
import br.dev.spring.demo.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(ProductService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<Product> productList(){
        return userService.findAll();
    }
}
