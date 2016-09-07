package com.anray.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.anray.starbuzz.data.Drink;

public class MainActivity extends AppCompatActivity {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.food_options);

//        ArrayAdapter<Drink> drinksData = new ArrayAdapter<Drink>(this,android.R.layout.simple_list_item_1,Drink.sDrinks);
//        mListView.setAdapter(drinksData);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {
//                showToast(String.valueOf(position)+" "+String.valueOf(id));
//                showToast(itemView.toString());
//                showToast(listView.toString());

                if (position == 0){
                    Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        mListView.setOnItemClickListener(itemClickListener);

    }

    public void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
