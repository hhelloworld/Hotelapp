package com.example.hotelapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bookingDB extends SQLiteOpenHelper {

    public bookingDB(@Nullable  Context context){
        super(context, "Booking.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table booking(BookingId INTEGER primary key AUTOINCREMENT, HotelName text, HotelAddress text, checkIn number, " +
                "checkOut number, TotalPrice number)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists booking");
    }

    public boolean insert(String HotelName, String HotelAddress, String checkIn, String checkOut, String TotalPrice) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("HotelName", HotelName);
        contentValues.put("HotelAddress", HotelAddress);
        contentValues.put("checkIn", checkIn);
        contentValues.put("checkOut", checkOut);
        contentValues.put("TotalPrice", TotalPrice);

        long ins = db.insert("booking", null, contentValues);
        if (ins == -1) return false;
        else return true;
    }

    Boolean checkName(String HotelName){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from booking where HotelName=?",new String[]{HotelName});
        if (cursor.getCount()>0) return false;
        else return true;
    }

    Boolean checkDate(String checkIn, String checkOut){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from booking where checkIn=? and checkOut=?", new String[]{checkIn,checkOut});
        if (cursor.getCount()>0) return false;
        else return true;
    }

     ArrayList<bookingList> data() {
        ArrayList<bookingList> booking = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from  booking",null);

        while(cursor.moveToNext()) {
            String hname = cursor.getString(1);
            String haddress = cursor.getString(2);
            String hadate1 = cursor.getString(3);
            String hdate2 = cursor.getString(4);
            String hprice = cursor.getString(5);

            bookingList bookingList = new bookingList(hname, haddress, hadate1, hdate2, hprice);
            booking.add(bookingList);
        }
        return booking;
    }

    Boolean deleteItem(String HotelName) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from booking where HotelName=? ", new String[]{HotelName});
        return null;
    }
}