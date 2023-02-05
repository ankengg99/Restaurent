package com.example.Restaurent.service;

import com.example.Restaurent.model.Restaurent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
@Service
public class RestaurentService {
    private static final List<Restaurent> restaurents=new ArrayList<>();
    static {
        restaurents.add(new Restaurent("Shayam","delhi","12346789","biryani"));
    }
    public  List<Restaurent> findAll(){
        return restaurents;
    }
    public void addList(Restaurent restaurent){
        restaurents.add(restaurent);
    }
    public Restaurent findByName(String name) throws NoSuchElementException {
        Predicate<? super Restaurent> predicate = restaurent -> restaurent.getName().equals(name);
        return restaurents.stream().filter(predicate).findFirst().get();
    }
    public void updateRestaurent(String name,Restaurent newRestaurent){
        Restaurent temp=findByName(name);
        temp.setCity(newRestaurent.getCity());
        temp.setName(newRestaurent.getName());
        temp.setNo(newRestaurent.getNo());
        temp.setSpecialist(newRestaurent.getSpecialist());
    }
    public void deleteRestaurent(String name){
        Predicate<? super Restaurent> predicate = restaurent -> restaurent.getName().equals(name);
        restaurents.removeIf(predicate);
    }
}
