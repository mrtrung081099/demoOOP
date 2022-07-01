package Model;

import AbstractClass.Plant;

public class AquariumPlant extends Plant {
    public int height;

    public AquariumPlant(String name, int height){
        this.name = name;
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void grow(){
        System.out.println(this.name+": grow up 5cm");
        this.height += 5;
    }
}
