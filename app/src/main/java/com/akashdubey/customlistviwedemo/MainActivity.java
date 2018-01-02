package com.akashdubey.customlistviwedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String [] names={"Salman Khan","Virat Kohli", "Sachin Tendulkar", "APJ Kalam","Arvind Kejriwal","B. Chandrakala","Manu Singh","Amit Kataria"," Manjunath M", "Satyendra Dubey"};
    String [] phone_numbers={"1111111111","2222222222","3333333333","4444444444","5555555555","6666666666","7777777777","8888888888","9999999999","0000000000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=(ListView)findViewById(R.id.listview1);
        MyCustomAdapter customAdapter= new MyCustomAdapter();
        lv.setAdapter(customAdapter);
    }


    public class MyCustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.customlistview,null);
            TextView name=(TextView)view.findViewById(R.id.nameTV);
            TextView phone=(TextView)view.findViewById(R.id.phoneTV);

            name.setText(names[i]);
            phone.setText(phone_numbers[i]);
            return view;
        }
    }
}
