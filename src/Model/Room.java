package Model;

public class Room{
    private int doors;
    private boolean monster;
    private boolean treasure;
    private int connectedWith1;
    private int connectedWith2;
    private int connectedWith3;

    public Room(int doors, boolean monster, boolean treasure, int connectedWith1, int connectedWith2, int connectedWith3){
        this.doors = doors;
        this.monster = monster;
        this.treasure = treasure;
        this.connectedWith1 = connectedWith1;
        this.connectedWith2 = connectedWith2;
        this.connectedWith3 = connectedWith3;

    }
}
