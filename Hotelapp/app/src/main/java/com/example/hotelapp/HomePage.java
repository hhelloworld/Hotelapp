package com.example.hotelapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {


    ListView listView;
    String[] aNamaHotel = {"Couleur","Ruru Urban Uma Dewata","Veranda Residence","Jabu Srengseng","Hotel 88 Grogol"};
    int[] aHarga = {400000, 300000, 600000, 350000, 340000};
    String[] anotlp = {"(021) 54399936","0812-8199-9818","(021) 5816161","0813-8155-3155","(021) 29336688"};
    String[] aAlamat = {"Jl. Lkr. Luar Barat No.1A, RT.10/RW.7, Duri Kosambi, Kecamatan Cengkareng, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11750","Jl. Kembangan Abadi III No.14, RT.2/RW.8, Kembangan Sel., Kec. Kembangan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11610","Jl. Pesanggrahan No.28, RT.2/RW.7, Kembangan Sel., Kec. Kembangan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11610", "Srengseng Dalam No.18, RT.4/RW.5, Srengseng, Kec. Kembangan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11630", "Jl. Dr. Susilo Raya, RT.4/RW.5, Grogol, Kec. Grogol petamburan, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11450"};
    double[] aLAT = {-6.1626827, -6.1707535, -6.1742126, -6.1992306, -6.1657546};
    double[] aLNG = {106.730348,106.7297894,106.7324344,106.7495304,106.7849419};
    int[] aGambar = {R.drawable.couleur,R.drawable.ruruurbanumadewata,R.drawable.verandaresidence,R.drawable.jabusrengseng,R.drawable.hotelgrogol};
    int[] aID = {1,2,3,4,5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        listView = findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(this,aNamaHotel,aHarga,anotlp,aAlamat,aLAT,aLNG,aGambar,aID);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent intent = new Intent(HomePage.this, HotelDetail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", aGambar[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("Nama Hotel", aNamaHotel[0]);
                    intent.putExtra("Harga", aHarga[0]);
                    intent.putExtra("No Tlp", anotlp[0]);
                    intent.putExtra("Alamat", aAlamat[0]);
                    intent.putExtra("LAT", aLAT[0]);
                    intent.putExtra("LNG", aLNG[0]);
                    intent.putExtra("ID", aID[0]);
                    intent.putExtra("Position", ""+0);
                    HomePage.this.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(HomePage.this, HotelDetail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", aGambar[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("Nama Hotel", aNamaHotel[1]);
                    intent.putExtra("Harga", aHarga[1]);
                    intent.putExtra("No Tlp", anotlp[1]);
                    intent.putExtra("Alamat", aAlamat[1]);
                    intent.putExtra("LAT", aLAT[1]);
                    intent.putExtra("LNG", aLNG[1]);
                    intent.putExtra("ID", aID[1]);
                    intent.putExtra("Position", ""+1);
                    HomePage.this.startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(HomePage.this, HotelDetail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", aGambar[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("Nama Hotel", aNamaHotel[2]);
                    intent.putExtra("Harga", aHarga[2]);
                    intent.putExtra("No Tlp", anotlp[2]);
                    intent.putExtra("Alamat", aAlamat[2]);
                    intent.putExtra("LAT", aLAT[2]);
                    intent.putExtra("LNG", aLNG[2]);
                    intent.putExtra("ID", aID[2]);
                    intent.putExtra("Position", ""+2);
                    HomePage.this.startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(HomePage.this, HotelDetail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", aGambar[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("Nama Hotel", aNamaHotel[3]);
                    intent.putExtra("Harga", aHarga[3]);
                    intent.putExtra("No Tlp", anotlp[3]);
                    intent.putExtra("Alamat", aAlamat[3]);
                    intent.putExtra("LAT", aLAT[3]);
                    intent.putExtra("LNG", aLNG[3]);
                    intent.putExtra("ID", aID[3]);
                    intent.putExtra("Position", ""+3);
                    HomePage.this.startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(HomePage.this, HotelDetail.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", aGambar[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("Nama Hotel", aNamaHotel[4]);
                    intent.putExtra("Harga", aHarga[4]);
                    intent.putExtra("No Tlp", anotlp[4]);
                    intent.putExtra("Alamat", aAlamat[4]);
                    intent.putExtra("LAT", aLAT[4]);
                    intent.putExtra("LNG", aLNG[4]);
                    intent.putExtra("ID", aID[4]);
                    intent.putExtra("Position", ""+4);
                    HomePage.this.startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] bNamaHotel;
        int[] bHarga;
        String[] bnotlp;
        String[] bAlamat;
        double[] bLAT;
        double[] bLNG;
        int[] bGambar;
        int[] bID;

        MyAdapter (Context c, String [] NamaHotel, int []Harga, String []notlp, String[] Alamat, double[] LAT, double[] LNG, int[] Gambar, int[] ID){
            super(c, R.layout.row, R.id.namahotel, NamaHotel);
            this.context = c;
            this.bNamaHotel =NamaHotel;
            this.bHarga = Harga;
            this.bnotlp = notlp;
            this.bAlamat = Alamat;
            this.bLAT = LAT;
            this.bLNG = LNG;
            this.bGambar = Gambar;
            this.bID = ID;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView imageView = row.findViewById(R.id.gambar);
            TextView aNamaHotel = row.findViewById(R.id.namahotel);
            TextView aHarga = row.findViewById(R.id.price);
            TextView anotlp = row.findViewById(R.id.notlp);
            TextView aAlamat = row.findViewById(R.id.alamat);
            TextView aLAT = row.findViewById(R.id.lat);
            TextView aLNG = row.findViewById(R.id.lng);
            TextView aID = row.findViewById(R.id.id);

            imageView.setImageResource(bGambar[position]);
            aNamaHotel.setText(bNamaHotel[position]);
            aHarga.setText(Integer.toString(bHarga[position]));
            anotlp.setText(bnotlp[position]);
            aAlamat.setText(bAlamat[position]);
            aLAT.setText(Double.toString(bLAT[position]));
            aLNG.setText(Double.toString(bLNG[position]));
            aID.setText(Integer.toString(bID[position]));


            return row;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent i = new Intent(HomePage.this, MyBookingPage.class);
                startActivity(i);
                return true;
            case R.id.item2:

                startActivity(new Intent(HomePage.this, login.class));

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
