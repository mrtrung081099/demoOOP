package Model;

import AbstractClass.Animal;
import Interface.IActivity;

public class Fish extends Animal implements IActivity{
    public Fish(){

    }
    public Fish(String name,String cLass){
        this.name = name;
        this.Class = cLass;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcLass() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public void action(String otherClass, String act) {
        System.out.println(this.name +": "+ act +" "+ otherClass);
    }
    public void eat(){
        System.out.println(this.name + ": eat");
    }
    public void dead(){
        System.out.println(this.name + ": dead");
    }
}
