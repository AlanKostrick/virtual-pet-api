package org.wecancodeit.serverside;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class VirtualPet {

    protected String name;
    protected String description;
    protected int happinessLevel;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public VirtualPet(){

    }
    public VirtualPet(String name, String description, int happinessLevel) {
        this.name = name;
        this.description = description;
        this.happinessLevel = happinessLevel;
    }

    public abstract void tick();
}
