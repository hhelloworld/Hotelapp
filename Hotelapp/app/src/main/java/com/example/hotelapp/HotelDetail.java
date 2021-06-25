package com.example.hotelapp;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.widget.Toast.LENGTH_LONG;

public class HotelDetail extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;
    private SimpleDateFormat dateFormatter;
    DatePickerDialog datePickerDialog;


    ImageView imageView;
    TextView namahotel, harga, notlp, alamat, lat, lng, id, res;
    Button click;
    int posistion;
    bookingDB bookingDB;


    @BindView(R.id.settgl1)
    Button pickstart;
    @BindView(R.id.settgl2)
    Button pickend;
    @BindView(R.id.startdate)
    TextView showstart;
    @BindView(R.id.enddate)
    TextView showend;
    @BindView(R.id.dateresult)
    TextView showresult;
    Calendar calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        bookingDB = new bookingDB(this);

        imageView = findViewById(R.id.gambar2);
        namahotel = findViewById(R.id.namahotel2);
        harga = findViewById(R.id.price2);
        notlp = findViewById(R.id.notlp2);
        alamat = findViewById(R.id.alamat2);
        lat = findViewById(R.id.lat2);
        lng = findViewById(R.id.lng2);
        id = findViewById(R.id.id2);

        click = findViewById(R.id.taptobook);


        if (posistion == 0) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int rgambar = bundle.getInt("image");
            String rnamahotel = intent.getStringExtra("Nama Hotel");
            int rharga = intent.getIntExtra("Harga", +1);
            String rnotlp = intent.getStringExtra("No Tlp");
            String ralamat = intent.getStringExtra("Alamat");
            double rlat = intent.getDoubleExtra("LAT", +1);
            double rlng = intent.getDoubleExtra("LNG",+1);
            int rid = intent.getIntExtra("ID", +1);

            imageView.setImageResource(rgambar);
            namahotel.setText(rnamahotel);
            harga.setText(Integer.toString(rharga));
            notlp.setText(rnotlp);
            alamat.setText(ralamat);
            lat.setText(Double.toString(rlat));
            lng.setText(Double.toString(rlng));
            id.setText(Integer.toString(rid));

            actionBar.setTitle(rnamahotel);

        }
        if (posistion == 1) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int gambar = bundle.getInt("image");
            String rnamahotel = intent.getStringExtra("Nama Hotel");
            String rharga = intent.getStringExtra("Harga");
            String rnotlp = intent.getStringExtra("No Tlp");
            String ralamat = intent.getStringExtra("Alamat");
            double rlat = intent.getDoubleExtra("LAT", +1);
            double rlng = intent.getDoubleExtra("LNG",+1);
            int rid = intent.getIntExtra("ID", +1);

            imageView.setImageResource(gambar);
            namahotel.setText(rnamahotel);
            harga.setText(rharga);
            notlp.setText(rnotlp);
            alamat.setText(ralamat);
            lat.setText(Double.toString(rlat));
            lng.setText(Double.toString(rlng));
            id.setText(Integer.toString(rid));


            actionBar.setTitle(rnamahotel);

        }
        if (posistion == 2) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int gambar = bundle.getInt("image");
            String rnamahotel = intent.getStringExtra("Nama Hotel");
            String rharga = intent.getStringExtra("Harga");
            String rnotlp = intent.getStringExtra("No Tlp");
            String ralamat = intent.getStringExtra("Alamat");
            double rlat = intent.getDoubleExtra("LAT", +1);
            double rlng = intent.getDoubleExtra("LNG",+1);
            int rid = intent.getIntExtra("ID", +1);

            imageView.setImageResource(gambar);
            namahotel.setText(rnamahotel);
            harga.setText(rharga);
            notlp.setText(rnotlp);
            alamat.setText(ralamat);
            lat.setText(Double.toString(rlat));
            lng.setText(Double.toString(rlng));
            id.setText(Integer.toString(rid));

            actionBar.setTitle(rnamahotel);

        }
        if (posistion == 3) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int gambar = bundle.getInt("image");
            String rnamahotel = intent.getStringExtra("Nama Hotel");
            String rharga = intent.getStringExtra("Harga");
            String rnotlp = intent.getStringExtra("No Tlp");
            String ralamat = intent.getStringExtra("Alamat");
            double rlat = intent.getDoubleExtra("LAT", +1);
            double rlng = intent.getDoubleExtra("LNG",+1);
            int rid = intent.getIntExtra("ID", +1);

            imageView.setImageResource(gambar);
            namahotel.setText(rnamahotel);
            harga.setText(rharga);
            notlp.setText(rnotlp);
            alamat.setText(ralamat);
            lat.setText(Double.toString(rlat));
            lng.setText(Double.toString(rlng));
            id.setText(Integer.toString(rid));

            actionBar.setTitle(rnamahotel);

        }
        if (posistion == 4) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int gambar = bundle.getInt("image");
            String rnamahotel = intent.getStringExtra("Nama Hotel");
            String rharga = intent.getStringExtra("Harga");
            String rnotlp = intent.getStringExtra("No Tlp");
            String ralamat = intent.getStringExtra("Alamat");
            double rlat = intent.getDoubleExtra("LAT", +1);
            double rlng = intent.getDoubleExtra("LNG",+1);
            int rid = intent.getIntExtra("ID", +1);

            imageView.setImageResource(gambar);
            namahotel.setText(rnamahotel);
            harga.setText(rharga);
            notlp.setText(rnotlp);
            alamat.setText(ralamat);
            lat.setText(Double.toString(rlat));
            lng.setText(Double.toString(rlng));
            id.setText(Integer.toString(rid));

            actionBar.setTitle(rnamahotel);

        }

        res = findViewById(R.id.dateresult);
        ButterKnife.bind(this);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        pickstart.setOnClickListener(v -> startDate());
        pickend.setOnClickListener(v -> endDate());

         click.setOnClickListener(v -> {
             if (showend.getText().toString().equals(showstart)){
                 Toast.makeText(getApplicationContext(), "Tanggal Booking tidak bisa di hari yang sama", Toast.LENGTH_LONG).show();
             }
             if (showstart.getText().toString().equals("") || showend.getText().toString().equals("")) {
                 Toast.makeText(getApplicationContext(), "isi tanggal booking", Toast.LENGTH_LONG).show();
             }
             else {
                  String hotelName = namahotel.getText().toString();
                 String hotelAddr = alamat.getText().toString();
                 String tanggal1 = showstart.getText().toString();
                 String tanggal2 = showend.getText().toString();
                 String price = showresult.getText().toString();

                     if (!tanggal1.equals(tanggal2)) {
                         Boolean check = bookingDB.checkDate(tanggal1, tanggal2);
                         if (check == true) {
                             Boolean insert = bookingDB.insert(hotelName, hotelAddr, tanggal1, tanggal2 , price);
                             if (insert == true) {
                                 Toast.makeText(getApplicationContext(), "Added to My Bookings Page !! !", LENGTH_LONG).show();
                             }

                         } else {
                             Toast.makeText(getApplicationContext(), " Tanggal booking tidak Valid / Sudah di Booking!", LENGTH_LONG).show();
                         }
                     }
                 }
             });

        initilizeMap();
    }

    private void startDate() {
        calendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
            Calendar dates = Calendar.getInstance();
            dates.set(year, month, dayOfMonth);

            showstart.setText(dateFormatter.format(dates.getTime()));
        },calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
        datePickerDialog.show();

    }

    private void endDate() {

        calendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
            Calendar dates = Calendar.getInstance();
            dates.set(year, month, dayOfMonth);

            showend.setText(dateFormatter.format(dates.getTime()));
        },calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
        datePickerDialog.show();



        if (showstart != null || showend !=null) {

            try {
                 String start = showstart.getText().toString();
                 String ends = showend.getText().toString();
                 String price = harga.getText().toString();

                NumberFormat format = new DecimalFormat("0.#");

                Date date = dateFormatter.parse(start);
                Date date2 = dateFormatter.parse(ends);

                long difference = Math.abs(date.getTime() - date2.getTime());
                long differenceDates = difference / (24 * 60 * 60 * 1000);

                Double dess = Double.valueOf(price);
                Double day = Double.valueOf(differenceDates);
                Double calculate = day * dess;

                res.setText("Total harga : " + "Rp." + format.format(calculate));

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            finish();
        }
    }



    private void initilizeMap() {
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.displaymap);
        mapFragment.getMapAsync(this);
        return;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        String a = lat.getText().toString();
        String b = lng.getText().toString();
        String lokasi = namahotel.getText().toString();
        double latt = Double.parseDouble(a);
        double lngg = Double.parseDouble(b);

        MarkerOptions marker = new MarkerOptions().position(new LatLng(latt, lngg)).title("Lokasi Hotel " + lokasi);
        googleMap.addMarker(marker);
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(), 14));
    }
}





