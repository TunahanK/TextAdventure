package Model;

public abstract class Creature{

    String name;
    int level;
    int livepoints;
    int strength;
    int defense;

    public String getName(){
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getLivepoints() {
        return livepoints;
    }
    public int getStrength() {
        return strength;
    }
    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setLivepoints(int livepoints) {
        this.livepoints = livepoints;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
}
