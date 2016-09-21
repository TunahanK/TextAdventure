package Model;

public class Charakter extends Creature {

    private int xp = 0;

    public Charakter(){
        this.name = "Seegurke-san";
        this.level = 1;
        this.livepoints = 10;
        this.strength = (int)(Math.random() * 4) + 8;
        this.defense = (int)(Math.random() * 4) + 8;
    }

    public void setXp(int xp){
        this.xp = xp;
    }
}
