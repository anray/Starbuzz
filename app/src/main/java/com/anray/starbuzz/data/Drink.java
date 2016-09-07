package com.anray.starbuzz.data;

import com.anray.starbuzz.R;

/**
 * Created by anray on 07.09.2016.
 */
public class Drink {
    private String mName;
    private String mDescription;
    private int mImageResourceId;
    public static final Drink[] sDrinks = {
            new Drink("Latte", "A couple with espresso shots with steam milk", R.drawable.latte),
            new Drink("Capuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.capucchino),
            new Drink("Filter", "Highest quality beans roated and brewed fresh", R.drawable.filter)
    };


    public Drink(String name, String description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return mName;
    }
}
