package org.wecancodeit.serverside;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dog extends OrganicPet {

    @GeneratedValue
    @Id
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public Dog() {
    }

    public Dog(String name, String description, int happinessLevel, int hungerLevel) {
        super(name, description, happinessLevel, hungerLevel);
    }

    public void walk(){
        hungerLevel += 5;
    }

}
