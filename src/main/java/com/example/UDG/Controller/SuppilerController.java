package com.example.UDG.Controller;

import com.example.UDG.Models.SuppilerModel;
import com.example.UDG.Services.SuppilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/suppiler")
public class SuppilerController {
    @Autowired
    SuppilerService suppilerService;

    //get
    @GetMapping()
    public ArrayList<SuppilerModel> findAllSuppiler(){
        return suppilerService.findAllSuppiler();
    }
    //post
    @PostMapping()
    public SuppilerModel saveSuppiler(@RequestBody SuppilerModel suppiler){
        return suppilerService.saveSuppiler(suppiler);
    }
    //edit
    @PutMapping(path = "/update")
    public SuppilerModel updateSuppiler(@RequestBody SuppilerModel suppiler) {
        return suppilerService.editById(suppiler);
    }
    //search by name
    @GetMapping(path ="/name")//localhost:8080/suppiler/{name}
    public ArrayList<SuppilerModel> findByName(@RequestParam("name")String name){
        return suppilerService.findByName(name);
    }
    //search by id
    @GetMapping(path ="/id")//localhost:8080/suppiler/{name}
    public Optional<SuppilerModel> findById(@RequestParam("id")long id) {
        return suppilerService.findById(id);
    }
    //search by Specialty
    @GetMapping(path = "/specialty")//localhost:8080/suppiler/{specialty}
    public ArrayList<SuppilerModel> findBySpecialty(@RequestParam("specialty")String specialty){
        return suppilerService.findBySpecialty(specialty);
    }
    //Delete
    @DeleteMapping(path="/delete")
    public String deleteSuppilerById(@RequestParam("id") long id){
        return suppilerService.deleteSuppiler(id);
    }
}
