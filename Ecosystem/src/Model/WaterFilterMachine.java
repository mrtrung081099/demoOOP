package Model;

import AbstractClass.Device;

public class WaterFilterMachine extends Device {
    public WaterFilterMachine(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void filter(){
        System.out.println(this.name+": Filtered water");
    }
}
