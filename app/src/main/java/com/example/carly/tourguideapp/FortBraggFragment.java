package com.example.carly.tourguideapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FortBraggFragment extends Fragment {

    public FortBraggFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations, info about the location, and an image to go with it.
        final ArrayList<Location> locations = new ArrayList<Location>();

        // locations.add("location name");
        locations.add(new Location(getString(R.string.forcecom), getString(R.string.forcecom_info), R.drawable.us_force_com));
        locations.add(new Location(getString(R.string.eighteenth), getString(R.string.eighteenth), R.drawable.xvii_airborne));
        locations.add(new Location(getString(R.string.specops), getString(R.string.specops_info), R.drawable.spec_ops));
        locations.add(new Location(getString(R.string.eightysecond), getString(R.string.eightysecond_info), R.drawable.eightysecond));
        locations.add(new Location(getString(R.string.commissary), getString(R.string.commissary_info), R.drawable.commissary_icon));
        locations.add(new Location(getString(R.string.deers), getString(R.string.deers_info), R.drawable.idcard_icon));
        locations.add(new Location(getString(R.string.exchange), getString(R.string.exchange_info), R.drawable.exchange_icon));
        locations.add(new Location(getString(R.string.housing), getString(R.string.housing_info), R.drawable.house_icon));
        locations.add(new Location(getString(R.string.mwr), getString(R.string.mwr_info), R.drawable.mwr_icon));
        locations.add(new Location(getString(R.string.womack), getString(R.string.womack_info), R.drawable.hospital_womack));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_fortbragg);

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
