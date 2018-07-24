package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 17045740 on 24/7/2018.
 */

class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<ColourList> colour;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ColourList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        colour = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
    
        ImageView ivImpt1 = rowView.findViewById(R.id.imgBlue);


        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        ColourList currentItem = colour.get(position);


        if (currentItem.isIsblue()) {
            ivImpt1.setImageResource(R.drawable.blue_box);

        } else if (currentItem.isIsorange()){
             ivImpt1.setImageResource(R.drawable.orange_box);
            } else
               ivImpt1.setImageResource(R.drawable.brown_box);


            // Return the View corresponding to the data at the specified position.
            return rowView;
        }
    }


