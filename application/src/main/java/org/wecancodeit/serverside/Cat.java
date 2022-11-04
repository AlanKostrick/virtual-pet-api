package org.wecancodeit.serverside;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cat extends OrganicPet {

    @GeneratedValue
    @Id
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public Cat() {
    }

    public Cat(String name, String description, int happinessLevel, int hungerLevel) {
        super(name, description, happinessLevel, hungerLevel);
    }
}
