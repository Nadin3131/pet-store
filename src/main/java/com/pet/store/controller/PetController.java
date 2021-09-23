package com.pet.store.controller;

import com.pet.store.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @GetMapping (path = "/pets")
    public List<Pet> getAll (){
        return List.of(new Pet(1L, "cat", "Fill", 7));
    }

    @PostMapping (path = "/pets"
            , consumes = MediaType.APPLICATION_JSON_VALUE
            , produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public Pet add (@RequestBody Pet pet){
        pet.setId(2L);
        return pet;
    }
}

