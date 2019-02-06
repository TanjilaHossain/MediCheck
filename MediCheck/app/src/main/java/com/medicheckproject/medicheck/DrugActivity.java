package com.medicheckproject.medicheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class DrugActivity extends AppCompatActivity {

    String[] items;
    ArrayList <String> listItems;
    ArrayAdapter <String> adapter;
    ListView listView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);
        listView = (ListView)findViewById(R.id.listview);
        editText = (EditText)findViewById(R.id.txtsearch);
        initialList();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().equals(""))
                {
                    //reset listview er jonne(jodi vul search dei sejonne ja korbe)
                    initialList();
                }
                else
                {
                    //search perform korbe
                    searchItem(s.toString());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void searchItem(String textToSearch)
    {
        for(String item : items)
        {
            if(!item.contains(textToSearch))
            {
                listItems.remove(item);
            }
        }

        adapter.notifyDataSetChanged();
    }

    public void initialList()
    {
        items = new String[]{"Azalid","Betacal","Lipex","Ace","Ace Plus","Actidex","Adaben Duo Gel","Ambonil","Apsol",
                "B-50 Forte","Baclon","Barbit","Barcavir","Benadip","Besiven Eye Drops","Bisoloc","Bonec","Brezofil",
                "CCB","Calbo 500","Calcicar","Carvista","Cef-3","Cipro-D","Ciprocin","Codcap","Cotrim",
                "Cyclid","DIETIL","DILATOR","DORENTA","Dancel Shampoo","De-rash","Deconil","DeflacortTM","Delipid",
                "Depram","Diprobet","Drotapan","Duloxen","EDENIL","EFOPAM","EMEZIN","EMEZIN PLUS","ESORAL",
                "ETORIX","EXPOTEN","Ebaril","Econate","Eczena","Entacyd","Entacyd Plus","FEOFEL-CL","FEOZIN",
                "FLUCODER","Famotack","Febustat","Feelnor","Fenazine","Fenofex","FexoTM Plus","Fixocard","Flegnin",
               "GELICON","GLUNOR","GLUNOR XR","GTN 2.6 SR","Gabapen","HANDIRUB","HUNNY","Hi-C,Hunycof","Hyronate","I-Penam","I-guard Eye","IRBES","Idatix","Inclox",
                "JANVIA","Joinix","KETONIC","KYNOLD","Ketorin","LAMIDIN","LAXITOL","LODIBEN","LOSECTIL","LOSECTIL PFS","Maxical?","Maxical? Plus","Miki-H","Newage","Noak","Oricox","Progesic",
                "Resadol","Silvage","Tendonil","VIR", "Z-Plex"};
        listItems = new ArrayList<>(Arrays.asList(items));
        adapter = new ArrayAdapter<String>(this,R.layout.activity_drug_list,R.id.txtitem, listItems);
        listView.setAdapter(adapter);
    }
}
