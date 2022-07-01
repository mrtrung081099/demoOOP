package Model;

import AbstractClass.Habitat;

public class Aquarium extends Habitat {
    public Aquarium(){

    }
    public Aquarium(String name, boolean isLiveable) {
        this.name = name;
        this.isLiveable = isLiveable;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsLiveable() {
        return isLiveable;
    }

    public void setIsLiveable(boolean isLiveable) {
        this.isLiveable = isLiveable;
    }
    public void polluted(){
        this.isLiveable = false;
        System.out.println(this.name + ": isLiveable "+ this.isLiveable);
    }
    public void clear(){
        this.isLiveable = true;
        System.out.println(this.name + ": isLiveable "+ this.isLiveable);
    }
}
