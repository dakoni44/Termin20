package org.ftninformatika.termin20_vezba;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Glumci extends Fragment {


    ListView listView;
    List<Glumac> glumci=new ArrayList<>();
    List<String> imena=new ArrayList<>();

    public Glumci() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_glumci, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        glumci=DataProvider.getInstance().getGlumci();
        for(int i=0;i<glumci.size();i++){
            imena.add(glumci.get(i).getIme()+" "+glumci.get(i).getPrezime());
        }

        listView=view.findViewById(R.id.lvGlumci);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,imena);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getContext(),Glumac_info.class);
                i.putExtra("position", position);
                startActivity(i);
            }
        });
    }
}
