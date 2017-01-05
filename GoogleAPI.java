package module5.homeOrk4;

import module5.homeOrk1and2.Room;

public class GoogleAPI extends APIAbstract {

    public void setRooms(Room[] rooms){
        this.rooms = rooms;
    }

    public GoogleAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(488,18, 4, 2010, 10, 7, "Ballarat", "Craig's Royal");
        roomsSet[1] = new Room(7312, 22, 5, 2013, 4, 1, "Adelaide", "Ibis Adelaide");
        roomsSet[2] = new Room(144, 50, 2, 2016, 5, 14, "Darwin", "Argus Apartments");
        roomsSet[3] = new Room(7492, 36, 5, 2012, 9, 7, "Worcester", "St Lawrence");
        roomsSet[4] = new Room(492, 21, 4, 2016, 9, 13,"Norwich", "38 St Giles");

        this.rooms = roomsSet;
    }
}
