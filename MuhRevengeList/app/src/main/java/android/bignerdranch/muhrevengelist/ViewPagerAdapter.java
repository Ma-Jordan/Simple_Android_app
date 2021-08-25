package android.bignerdranch.muhrevengelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

class ViewPagerAdapter extends PagerAdapter {
    private ArrayList<String> arrayList;
    private Context mContext;

    public ViewPagerAdapter(Context context, ArrayList<String> arrayList){
        this.arrayList = arrayList;
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position){
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.view_pager_adapter, collection, false);

        EditText editText = layout.findViewById(R.id.edit_text);
        editText.setText(arrayList.get(position).toString());
        Button addButton = layout.findViewById(R.id.add_button);
        Button editButton = layout.findViewById(R.id.edit_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.add(position, editText.getText().toString());
                notifyDataSetChanged();

            }

        });

        editButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                arrayList.remove(position);
                arrayList.add(position,editText.getText().toString());
                notifyDataSetChanged();
            }
        });
        collection.addView(layout);
        return layout;
    }
    @Override
    public int getCount(){
        return arrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view){
        collection.removeView((View)view);
    }


    @Override
    public void notifyDataSetChanged(){
        super.notifyDataSetChanged();
    }
}
