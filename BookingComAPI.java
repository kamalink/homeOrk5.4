package module5.homeOrk4;

import module5.homeOrk1and2.Room;

public class BookingComAPI extends APIAbstract {

    public void setRooms(Room[] rooms){
        this.rooms = rooms;
    }

    public BookingComAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(5632,20,3,2015, 12, 2, "Marseille", "Sofitel");
        roomsSet[1] = new Room(44678, 12, 9, 2015, 8, 25, "Itaituba", "Sao Tome");
        roomsSet[2] = new Room(84043, 24, 4, 2016, 4, 22, "Manaus", "Intercity Manaus");
        roomsSet[3] = new Room(293, 19, 10, 2011, 10,11, "Barinas", "Valle Hondo");
        roomsSet[4] = new Room(48200, 34, 2, 2013, 1, 12,"Bologna", "Hotel Roma");

        this.rooms = roomsSet;
    }


}

