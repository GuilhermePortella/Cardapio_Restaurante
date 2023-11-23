package com.cardapio.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guilherme
 */
@RestController
@RequestMapping("food")
public class FoodController {
    
    @GetMapping
    public void getAll(){
        
    }
}
