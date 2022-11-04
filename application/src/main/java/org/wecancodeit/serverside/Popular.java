package org.wecancodeit.serverside;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Popular implements CommandLineRunner {

    @Resource
    private DogRepository dogRepo;

    @Resource
    private CatRepository catRepo;

    @Override
    public void run(String... args) throws Exception {



        Dog fido = new Dog("Fido", "Happy Dog", 50, 50);
        Dog sparky = new Dog("Sparky", "Happy Dog", 50, 50);
        Cat whiskers = new Cat("Whiskers", "Happy Dog", 50, 50);

        dogRepo.save(fido);
        dogRepo.save(sparky);
        catRepo.save(whiskers);


    }
}
