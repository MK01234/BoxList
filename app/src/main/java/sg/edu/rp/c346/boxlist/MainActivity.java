package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ColourList> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.lvColour);

      alToDoList = new ArrayList<>();
        //Calendar date1 = Calendar.getInstance();
        //date1.set(2018,7,1);
        //Calendar date2 = Calendar.getInstance();
        //date2.set(2018,9,22);
        ColourList item1 = new ColourList(true, false, false );
        ColourList item2 = new ColourList(false, true, false);
        ColourList item3 = new ColourList(false , false , true);
        alToDoList.add(item1);
        alToDoList.add(item2);
        alToDoList.add(item3);

        caToDo = new CustomAdapter(this, R.layout.colour, alToDoList);

        lvToDo.setAdapter((ListAdapter) caToDo);
    }
}
