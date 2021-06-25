package com.example.hotelapp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MyBookingPage extends AppCompatActivity {

    Button delete;

     ListView listView;
     bookingDB bookingDB;
     ArrayList<bookingList> booking;
     bookingAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mybookingspage);
        bookingDB = new bookingDB(this);
        listView = findViewById(R.id.list_booked);
        delete = findViewById(R.id.delete_button);
        loadData();


    }


    private void loadData() {
        booking = bookingDB.data();
        adapter = new bookingAdapter(booking, this);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
