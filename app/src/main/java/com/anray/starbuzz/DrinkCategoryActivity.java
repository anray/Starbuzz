package com.anray.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.anray.starbuzz.data.Drink;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<Drink> drinksAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1, Drink.sDrinks);

        getListView().setAdapter(drinksAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        showToast(String.valueOf(position));
        Intent intent = new Intent(this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.DRINK_NO, (int) id);
        startActivity(intent);
    }

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
