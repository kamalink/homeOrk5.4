package module5.homeOrk4;

import module5.homeOrk1and2.Room;

public class TripAdvisorAPI extends APIAbstract {

    public void setRooms(Room[] rooms){
        this.rooms = rooms;
    }

    public TripAdvisorAPI() {
        Room[] roomsSet = new Room[5];
        roomsSet[0] = new Room(9387,35,5,2015, 5, 30, "Ulm", "Neuthor");
        roomsSet[1] = new Room(37991, 27, 6, 2012, 3, 18, "Mainz", "Hilton");
        roomsSet[2] = new Room(38900, 45, 3, 2014, 6, 23, "Tolhuin", "Hosteria Rutalsur");
        roomsSet[3] = new Room(6743, 42, 2, 2011, 9, 21, "Yangon", "Savoy");
        roomsSet[4] = new Room(48200, 9, 2, 2012, 2, 3,"Munger", "Hotel Raj");

        this.rooms = roomsSet;
    }

    }

