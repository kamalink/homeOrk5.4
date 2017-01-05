package module5.homeOrk4;

import module5.homeOrk1and2.Room;
import module5.homeOrk3.API;

public abstract class APIAbstract implements API {
    public Room[] rooms;

    @Override
    public Room [] findRooms (int price, int persons, String city, String hotel){

        int roomsPrice;
        int roomsPersons;
        String roomsCity;
        String roomsHotel;

        Room[] roomsFound = new Room[5];
        Room[] apiRooms = getRooms();

        int searchCounter = 0;
        for (int i = 0; i< apiRooms.length; i++){

            roomsPrice = apiRooms[i].getPrice();
            roomsPersons = apiRooms[i].getPersons();
            roomsCity = apiRooms[i].getCityName();
            roomsHotel = apiRooms[i].getHotelName();

            if(price == roomsPrice && persons == roomsPersons &&
                    city.equals(roomsCity) && hotel.equals(roomsHotel)) {
                roomsFound[searchCounter] = apiRooms[i];
                searchCounter++;
            }
        }
        return roomsFound;
    }

    public Room[] getRooms(){
        return rooms;
    }
}
