package com.example.hermes.bitcointwallet;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.customToolbar);
        setSupportActionBar(mToolbar);
        setTitle("");

        ListView listView = (ListView)findViewById(R.id.items_listView);

        CustomAdapter adapter = new CustomAdapter(this, R.id.list_of_items, listOfDataObjects());

        listView.setAdapter(adapter);


    }

    public ArrayList<DataObject> listOfDataObjects(){
        ArrayList<DataObject> arrayList = new ArrayList<DataObject>();

        DataObject dataObjects = new DataObject();
        dataObjects.setmTime("14:22");
        dataObjects.setmHashString("234SFG43Fdggd44s");
        dataObjects.setmValue("+0.0044 BTC");
        dataObjects.setmNotes("Test note");

        DataObject dataObjects2 = new DataObject();
        dataObjects2.setmTime("11:00");
        dataObjects2.setmHashString("234SFG43Fdggd44s");
        dataObjects2.setmValueRed("+0.00334 BTC");
        dataObjects2.setmNotes("");
        dataObjects2.setmDotsGreen("....");

        DataObject dataObjects3 = new DataObject();
        dataObjects3.setmTime("09:33");
        dataObjects3.setmHashString("234SFG43Fdggd44s");
        dataObjects3.setmValue("+0.00654 BTC");
        dataObjects3.setmNotes("");

        arrayList.add(dataObjects);
        arrayList.add(dataObjects2);
        arrayList.add(dataObjects3);

        return arrayList;
    }

    public void displaySecondScreen(View view){
        Intent intent = new Intent(this, SecondScreen.class);
        startActivity(intent);
    }

}
