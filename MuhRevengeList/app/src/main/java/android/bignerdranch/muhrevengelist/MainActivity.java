package android.bignerdranch.muhrevengelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList.add("Willie Stroker");
        arrayList.add("Ben Dover");
        arrayList.add("Moe Lester");
        arrayList.add("Chris P Bacon");
        arrayList.add("Al Kahaliq");
        arrayList.add("Anita Baath");
        arrayList.add("Mike Hawk");
        arrayList.add("Hugh Jass");
        arrayList.add("Dill Doe");

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPagerAdapter(this, arrayList));
    }

}