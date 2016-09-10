package task1_2;

import java.util.Date;

/**
 * ЗАДАНИЕ 1
 * Class Room should contain fields
 * long id
 * int price
 * int persons
 * Date dateAvailableFrom
 * String hotelName
 * String cityName
 * Generate getters and setters. And create constructor with all fields.
 * <p>
 * ЗАДАНИЕ 2
 * Override equals and hashCode methods. Rooms are equal when price, persons and cityName are equal.
 */
public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.setId(id);
        this.setPrice(price);
        this.setPersons(persons);
        this.setDateAvailableFrom(dateAvailableFrom);
        this.setHotelName(hotelName);
        this.setCityName(cityName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (price != room.price) return false;
        if (persons != room.persons) return false;
        if (!hotelName.equals(room.hotelName)) return false; //added hotel name
        return cityName.equals(room.cityName);

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + hotelName.hashCode();
        result = 31 * result + cityName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
