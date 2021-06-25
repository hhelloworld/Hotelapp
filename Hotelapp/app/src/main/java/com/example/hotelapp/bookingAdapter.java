package com.example.hotelapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class bookingAdapter extends BaseAdapter {
    ArrayList<bookingList> list;
    Context context;
    bookingDB bookingDB;


    public bookingAdapter(ArrayList<bookingList> list, Context cont) {
        this.list = list;
        this.context = cont;
    }

    @Override
    public int getCount() {
        return this.list.size();

    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inf.inflate(R.layout.row2, null);

        final TextView name = (TextView) convertView.findViewById(R.id.namabooking);
        TextView address = (TextView) convertView.findViewById(R.id.alamatbooking);
        TextView start = (TextView) convertView.findViewById(R.id.tanggamulai);
        TextView ends = (TextView) convertView.findViewById(R.id.tanggalakhir);
        TextView prices = (TextView) convertView.findViewById(R.id.hargabooking);
        final Button delete = (Button) convertView.findViewById(R.id.delete_button);


        final bookingList b = list.get(position);
        name.setText(b.getHotelName());
        address.setText(b.getHotelAddress());
        start.setText(b.getCheckIn());
        ends.setText(b.getCheckOut());
        prices.setText(b.getTotalPrice());

        bookingDB = new bookingDB(context);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog alertDialog = new AlertDialog.Builder(context)
                        .setTitle("Warning")
                        .setMessage("Are you sure want to delete?")
                        .setPositiveButton("Yes", null)
                        .setNegativeButton("Cancel", null)
                        .show();

                Button positive = alertDialog.getButton(alertDialog.BUTTON_POSITIVE);
                positive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String HotelName = name.getText().toString();
                        bookingDB.deleteItem(HotelName);
                        list.remove(position);
                        notifyDataSetChanged();

                        Toast.makeText(context, "Booking Canceled ", Toast.LENGTH_LONG).show();
                        alertDialog.dismiss();
                    }
                });
            }
        });

        return convertView;

    }
}


