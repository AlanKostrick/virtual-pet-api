package org.wecancodeit.serverside;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrganicPet extends VirtualPet{


    @GeneratedValue
    @Id
    protected Long id;

    protected int hungerLevel;

    public Long getId(){
        return id;
    }

    public int getHungerLevel(){
        return hungerLevel;
    }

    public OrganicPet(){}


    public OrganicPet(String name, String description, int happinessLevel, int hungerLevel) {
        super(name, description, happinessLevel);
        this.hungerLevel = hungerLevel;
    }

    @Override
    public void tick() {
    hungerLevel +=10;
    }
}
