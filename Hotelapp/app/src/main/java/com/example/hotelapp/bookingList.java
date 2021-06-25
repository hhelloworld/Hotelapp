package com.example.hotelapp;


public class bookingList {

    String HotelName, HotelAddress, checkIn, checkOut, TotalPrice;

    public bookingList(String hotelName, String hotelAddress, String checkIn, String checkOut, String totalPrice) {
        HotelName = hotelName;
        HotelAddress = hotelAddress;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        TotalPrice = totalPrice;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getHotelAddress() {
        return HotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        HotelAddress = hotelAddress;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }
}
