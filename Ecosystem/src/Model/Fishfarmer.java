package Model;

import AbstractClass.Human;
import Interface.IActivity;

public class Fishfarmer extends Human implements IActivity{
    public Fishfarmer (){
    }
    public Fishfarmer(String name, String age, String gender, String weight, String height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public void action(String otherClass, String act) {
        System.out.println(this.name +": "+ act +" "+ otherClass);
    }
    public void eat() {
        System.out.println(this.name + ": eat");
    }
    public void sleep() {
        System.out.println(this.name +": sleep");
    }

}
