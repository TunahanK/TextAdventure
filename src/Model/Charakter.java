package Model;

public class Charakter extends Creature {

    public Charakter(){
        this.name = "Charakter";
        this.level = 1;
        this.livepoints = 10;
        this.strength = (int)(Math.random() * 1);
    }


}
