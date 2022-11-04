package org.wecancodeit.serverside;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
public class OrganicController {

    @Resource
    private OrganicRepository organicRepo;

    @GetMapping("/organic-pets")
    public Collection<OrganicPet> getAllOrganicPets(){
        return (Collection<OrganicPet>) organicRepo.findAll();
    }
}
