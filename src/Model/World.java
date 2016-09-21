package Model;

public class World {
    private Room[] allRooms;


    public World() {

    }

    public void addRoom(int doors, boolean monster, boolean treasure, int connectedWith1, int connectedWith2, int connectedWith3){
        Room[] newAllRooms = new Room[allRooms.length+1];
        for (int i = 0; i < allRooms.length; i++) {
            newAllRooms[i] = allRooms[i];
        }
        newAllRooms[allRooms.length] = new Room(doors, monster, treasure, connectedWith1, connectedWith2, connectedWith3);
        allRooms = newAllRooms;
    }
}
