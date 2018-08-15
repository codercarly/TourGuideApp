package com.example.carly.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations, info about the location, and an image to go with it.
        final ArrayList<Location> locations = new ArrayList<Location>();

        // locations.add("location name");
        locations.add(new Location(getString(R.string.fourth), getString(R.string.fourth_info), R.drawable.fourth_friday));
        locations.add(new Location(getString(R.string.dickens), getString(R.string.dickens_info), R.drawable.dickens_hat));
        locations.add(new Location(getString(R.string.blues), getString(R.string.blues_info), R.drawable.blues_brews));
        locations.add(new Location(getString(R.string.dogwood), getString(R.string.dogwood_info), R.drawable.dogwood_blossom));
        locations.add(new Location(getString(R.string.field), getString(R.string.field_info), R.drawable.american_flag));
        locations.add(new Location(getString(R.string.folk), getString(R.string.folk_info), R.drawable.international));
        locations.add(new Location(getString(R.string.reading), getString(R.string.reading_info), R.drawable.book));
        locations.add(new Location(getString(R.string.zombie), getString(R.string.zombie_info), R.drawable.zombie));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_events);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;

    }

}
