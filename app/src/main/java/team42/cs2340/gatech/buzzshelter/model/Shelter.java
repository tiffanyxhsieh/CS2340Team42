package team42.cs2340.gatech.buzzshelter.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ckadi on 2/25/2018.
 */

public class Shelter {
    /** this shelter's name */
    private String name;

    /** the shelter's address */
    private String address;

    /** the shelter's capacity */
    private String capacity;

    /** the shelter's latitude */
    private double latitude;

    /** the shelter's longitude */
    private double longitude;

    /** the shelter's phone number */
    private String phone;

    /** restrictions pertaining to this shelter */
    private String restrictions;

    /** notes pertaining to this shelter */
    private String notes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Create a new shelter
     * @param name          the shelter's name
     * @param address       the shelter's address
     * @param capacity      the shelter's capacity
     * @param latitude      the shelter's latitude
     * @param longitude     the shelter's longitude
     * @param phone         the shelter's phone number
     * @param restrictions  restrictions pertaining to the shelter
     * @param notes         notes pertaining to the shelter
     */
    public Shelter(String name, String address, String capacity,
                   double latitude, double longitude, String phone,
                   String restrictions, String notes) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phone = phone;
        this.restrictions = restrictions;
        this.notes = notes;
    }

    public Shelter() {

    }

    public String toString() {
        return this.name + " @ " + this.address;
    }
    // TODO: functionality to add user to a shelter if space permits (reservation)
}