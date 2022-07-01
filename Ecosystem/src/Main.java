import Interface.Impl.Blue;
import Interface.Impl.Red;
import Model.*;

public class Main {
    public static void main(String[] args) {
        Fishfarmer fishFarmer = new Fishfarmer("fishFarmer","23","Male","55kg","178cm");
        Fish fish = new Fish("Fish","Ray-finned fishes");
        Fish fish2 = new Fish("Fish2","Ray-finned fishes");
        Aquarium aquarium = new Aquarium("Aquarium",true);
        Light light = new Light(new Red(),"Red light");
        Light light2 = new Light(new Blue(),"Blue light");
        WaterFilterMachine waterFilterMachine = new WaterFilterMachine("WaterFilterMachine");
        AquariumPlant aquariumPlant = new AquariumPlant("AquariumPlant",10);
        AquariumPlant aquariumPlant2 = new AquariumPlant("AquariumPlant2",15);
        System.out.println("The ecosystem includes:");
        System.out.println("1 "+ fishFarmer.name);
        System.out.println("2 fish:"+ fish.name +", "+fish2.name);
        System.out.println("1 "+ fish.name +", "+fish2.name);
        System.out.println("1 "+ light.name);
        System.out.println("1 "+ waterFilterMachine.name);
        System.out.println("2 aquariumPlant:"+ aquariumPlant.name +", "+aquariumPlant2.name);

        System.out.println("---------Activity------");

        fish.action(aquarium.name, "live in");
        fish2.action(aquarium.name, "live in");
        fishFarmer.action(fish.name,"feed" );
        fish.eat();
        fishFarmer.action(fish2.name,"feed" );
        fish2.eat();
        aquarium.polluted();
        waterFilterMachine.filter();
        aquarium.clear();
        aquariumPlant.grow();
        aquariumPlant2.grow();
        fish.action(aquariumPlant.name,"eat");
        fish2.action(aquariumPlant2.name,"eat");
        fish2.dead();
        fishFarmer.action(fish2.name,"cook");
        fishFarmer.eat();
        fishFarmer.action(light.name,"turn on" );
        light.light();
        fishFarmer.action(light2.name,"turn on" );
        light2.light();
        fishFarmer.action(light.name,"turn off" );
        fishFarmer.action(light2.name,"turn off" );
        fishFarmer.sleep();

    }
}
