package com.anray.starbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.anray.starbuzz.data.Drink;

public class DrinkActivity extends AppCompatActivity {

    public static final String DRINK_NO = "Drink_#";
    private int mDrinkNo;

    private TextView mName, mDescription;
    private ImageView mCoffeeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        mName = (TextView) findViewById(R.id.coffee_name);
        mDescription = (TextView) findViewById(R.id.coffee_description);
        mCoffeeImage = (ImageView) findViewById(R.id.coffee_image);

        mDrinkNo = (int) getIntent().getExtras().get(DRINK_NO);

        mName.setText(Drink.sDrinks[mDrinkNo].getName());
        mDescription.setText(Drink.sDrinks[mDrinkNo].getDescription());
        mCoffeeImage.setImageResource(Drink.sDrinks[mDrinkNo].getImageResourceId());
        mCoffeeImage.setContentDescription(Drink.sDrinks[mDrinkNo].getDescription());

    }
}
