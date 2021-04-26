package com.example.tugasempat;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;

public class ListWisataData {
    public static String[] title = new String[]{
            "Borobudur",
            "Ratu Boko",
            "Sambisari"
    };
    public static int[] thumbnail = new int[]{
            R.drawable.gambar1,
                    R.drawable.gambar2,
                    R.drawable.gambar3
    };
    public static ArrayList<ListWisataModel> getListData(){
        ListWisataModel listWisataModel = null;
        ArrayList<ListWisataModel> list =  new ArrayList<>();
        for (int i=0; i<title.length; i++){
            listWisataModel = new ListWisataModel();
            listWisataModel.setLogo(thumbnail[i]);
            listWisataModel.setNamaWisata(title[i]);
            list.add(listWisataModel);
        }
        return list;
    }
}
