package com.example.freedomfighters;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.INotificationSideChannel;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ListView listView;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sardar Vallabhbhai Patel");/*1*/
        arrayList.add("Jawaharlal Nehru");/*2*/
        arrayList.add("Mahatma Gandhi");/*3*/
        arrayList.add("Tantia Tope");/*4*/
        arrayList.add("Nana Sahib");/*5*/
        arrayList.add("Lal Bahadur Shastri");/*6*/
        arrayList.add("Subhash Chandra Bose");/*7*/
        arrayList.add("Bhagat Singh");/*8*/
        arrayList.add("Sukhdev");/*9*/
        arrayList.add("Rajguru");/*10*/
        arrayList.add("Rani Lakshmi Bai");/*11*/
        arrayList.add("Bal Gangadhar Tilak");/*12*/
        arrayList.add("Mangal Pandey");/*13*/
        arrayList.add("Dadabhai Naoroji");/*14*/
        arrayList.add("K.M. Munshi");/*15*/
        arrayList.add("Bipin Chandra Pal");/*16*/
        arrayList.add("Chandra Shekhar Azad");/*17*/
        arrayList.add("Chittaranjan Das");/*18*/
        arrayList.add("Ashfaqulla Khan");/*19*/
        arrayList.add("Begum Hazrat Mahal");/*20*/

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                if(i==0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Vallabhbhai_Patel"));
                    startActivity(intent);
                }
                if(i==1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Jawaharlal_Nehru"));
                    startActivity(intent);
                }
                if(i==2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Mahatma_Gandhi"));
                    startActivity(intent);
                }
                if(i==3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Tatya_Tope"));
                    startActivity(intent);
                }
                if(i==4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Nana_Saheb"));
                    startActivity(intent);
                }
                if(i==5) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Lal_Bahadur_Shastri"));
                    startActivity(intent);
                }
                if(i==6) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Subhas_Chandra_Bose"));
                    startActivity(intent);
                }
                if(i==7) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Bhagat_Singh"));
                    startActivity(intent);
                }
                if(i==8) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Sukhdev_Thapar"));
                    startActivity(intent);
                }
                if(i==9) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Shivaram_Rajguru"));
                    startActivity(intent);
                }
                if(i==10) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Rani_of_Jhansi"));
                    startActivity(intent);
                }
                if(i==11) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Bal_Gangadhar_Tilak"));
                    startActivity(intent);
                }
                if(i==12) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Mangal_Pandey"));
                    startActivity(intent);
                }
                if(i==13) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Dadabhai_Naoroji"));
                    startActivity(intent);
                }
                if(i==14) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Kanaiyalal_Maneklal_Munshi"));
                    startActivity(intent);
                }
                if(i==15) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Bipin_Chandra_Pal"));
                    startActivity(intent);
                }
                if(i==16) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Chandra_Shekhar_Azad"));
                    startActivity(intent);
                }
                if(i==17) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Chittaranjan_Das"));
                    startActivity(intent);
                }
                if(i==18) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Ashfaqulla_Khan"));
                    startActivity(intent);
                }
                if(i==19) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Begum_Hazrat_Mahal"));
                    startActivity(intent);
                }

            }
        });
    }
}



