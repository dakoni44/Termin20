package org.ftninformatika.termin20_vezba;


import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Glumac_info extends Fragment {

    TextView tvIme,tvPrezime,tvDatumS,tvDatumR,tvBio;
    ImageView ivGlumac;
    List<Glumac> glumci=new ArrayList<>();
    List<String> slike=new ArrayList<>();

    public Glumac_info() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_glumac_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        glumci=DataProvider.getInstance().getGlumci();
        for(int i=0;i<glumci.size();i++){
            slike.add(glumci.get(i).getFoto());
        }
        tvIme=view.findViewById(R.id.tvIme);
        tvPrezime=view.findViewById(R.id.tvPrezime);
        tvDatumR=view.findViewById(R.id.tvDatumR);
        tvDatumS=view.findViewById(R.id.tvDatumS);
        tvBio=view.findViewById(R.id.tvBio);
        ImageView iv=view.findViewById(R.id.ivGlumac);
        try {
            InputStream is = getAssets().open(glumci.ge);
            Drawable drawable = Drawable.createFromStream(is,"");
            iv.setImageDrawable(drawable);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
