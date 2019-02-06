package com.medicheckproject.medicheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.*;
import java.util.List;
import android.view.View;
public class GeneralDiseaseActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> langs;
    Map<String, List<String>>topics;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_disease);

        expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
        fillData();

        listAdapter = new MyExListAdapter(this,langs,topics);
        expandableListView.setAdapter(listAdapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if(groupPosition == 0 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_three);
                    }
                    if(childPosition == 3)
                    {
                        setContentView(R.layout.activity_behavior_four);
                    }
                    if(childPosition == 4)
                    {
                        setContentView(R.layout.activity_behavior_five);
                    }


                }
                if(groupPosition == 1 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 3)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 4)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }

                }
                if(groupPosition == 2 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }


                }
                if(groupPosition == 3 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 3)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }


                }
                if(groupPosition == 4 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 3)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 4)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }

                }
                if(groupPosition == 5 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }


                }
                if(groupPosition == 6 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 2)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 3)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }
                    if(childPosition == 4)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }

                }
                if(groupPosition == 7 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }

                }
                if(groupPosition == 8 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }

                }
                if(groupPosition == 9 )
                {
                    if(childPosition == 0)
                    {
                        setContentView(R.layout.activity_behavior_one);
                    }
                    if(childPosition == 1)
                    {
                        setContentView(R.layout.activity_behavior_two);
                    }

                }
                return false;
            }
        });

    }
    /*public  void onClickBackButton(View v)
    {



        if(v.getId() == R.id.bBack)
        {

            Intent j = new Intent(GeneralDiseaseActivity.this,GeneralDiseaseActivity.class);
            startActivity(j);
        }


    }*/



    public void fillData()
    {
        langs = new ArrayList<>();
        topics = new HashMap<>();

        langs.add("Behavior and Emotions");
        langs.add("Children's Health");
        langs.add("Ears");
        langs.add("Eyes");
        langs.add("General Problems");
        langs.add("Head and Nervous System");
        langs.add("Heart and Circulation");
        langs.add("Mouth Disease");
        langs.add("Nose,Throat,Lungs and Chest Disease");
        langs.add("Skin,Scalp and Nails");

        List<String> Behavior   = new ArrayList<>();
        List<String> Childrens  = new ArrayList<>();
        List<String> Ears       = new ArrayList<>();
        List<String> Eyes       = new ArrayList<>();
        List<String> General    = new ArrayList<>();
        List<String> Head       = new ArrayList<>();
        List<String> Heart      = new ArrayList<>();
        List<String> Mouth      = new ArrayList<>();
        List<String> Nose       = new ArrayList<>();
        List<String> Skin       = new ArrayList<>();


        Behavior.add("Alcohol Abuse and Alcoholism");
        Behavior.add("Attention Deficit Disorder");
        Behavior.add("Depression");
        Behavior.add("Drug Abuse");
        Behavior.add("Stress");

        Childrens.add("Bed-Wetting");
        Childrens.add("Chicken pox");
        Childrens.add("Diper Rash");
        Childrens.add("Diarrhea");
        Childrens.add("Teething");

        Ears.add("Airplane Ears");
        Ears.add("Ear Infections");
        Ears.add("Earwax");


        Eyes.add("Cataracts");
        Eyes.add("Conjunctivitis");
        Eyes.add("Glaucoma");
        Eyes.add("Styes");

        General.add("Anemia");
        General.add("Diabetes");
        General.add("Hepatities");
        General.add("Infections");
        General.add("Sleep Disorder");

        Head.add("Alzheimer's Disease");
        Head.add("Meningitis and Encephalities");
        Head.add("Parkinson's Disease");


        Heart.add("Congestive Heart Failure");
        Heart.add("High Blood Pressure");
        Heart.add("Narrowed Arteries");
        Heart.add("Palpitations");
        Heart.add("Stroke");


        Mouth.add("Bad Breath");
        Mouth.add("Cold Sores");

        Nose.add("Cold");
        Nose.add("Sore Throat");

        Skin.add("Acne");
        Skin.add("Fungal Infections");


        topics.put(langs.get(0),Behavior);
        topics.put(langs.get(1),Childrens);
        topics.put(langs.get(2),Ears);
        topics.put(langs.get(3),Eyes);
        topics.put(langs.get(4),General);
        topics.put(langs.get(5),Head);
        topics.put(langs.get(6),Heart);
        topics.put(langs.get(7),Mouth);
        topics.put(langs.get(8),Nose);
        topics.put(langs.get(9),Skin);


    }




}
