package Model;

import AbstractClass.Device;
import Interface.IColor;

public class Light extends Device {
    private IColor color;
    public Light(IColor anyColor, String name){
        this.color = anyColor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void light(){
        this.color.colorLight();
    }

}
