package com.example.Restaurent.controller;

import com.example.Restaurent.model.Restaurent;
import com.example.Restaurent.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
@RestController
@RequestMapping("/restaurent-app")
public class RestaurentController {
    @Autowired
    RestaurentService restaurentService;
    @GetMapping("/get-restaurents")
    public List<Restaurent> get(){
        return restaurentService.findAll();
    }
    @PostMapping("/add-restaurents")
    public void add(@RequestBody Restaurent restaurent){
        restaurentService.addList(restaurent);
    }
    @GetMapping("/get-restaurent/name/{name}")
    public Restaurent findByName(@PathVariable String name){
       return  restaurentService.findByName(name);
    }
    @PutMapping("/update-restaurent/name/{name}")
    public void update(@PathVariable String name,@RequestBody Restaurent restaurent){
        restaurentService.updateRestaurent(name,restaurent);
    }
    @DeleteMapping("/delete-restaurents/name/{name}")
    public void delete(@PathVariable String name){
        restaurentService.deleteRestaurent(name);
    }
}
