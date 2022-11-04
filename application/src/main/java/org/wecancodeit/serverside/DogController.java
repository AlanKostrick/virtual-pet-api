package org.wecancodeit.serverside;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
public class DogController {

    @Resource
    private DogRepository dogRepo;

    @GetMapping("/dogs")
    public Collection<Dog> getAllDogs(){
        return (Collection<Dog>) dogRepo.findAll();
    }

    @GetMapping("/dogs/{id}/walk")
    public String walkADog(@PathVariable Long id){
        Dog dogToWalk = dogRepo.findById(id).get();
        dogToWalk.walk();
        return dogToWalk.getName() + " Has been walked its new hunger level is " + dogToWalk.getHungerLevel();
    }
}
