package com.elif.swipecardsview;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.huxq17.swipecardsview.BaseCardAdapter;

import java.util.List;

/**
 * Created by elfay on 12/10/2017.
 */

public class SwipeCardsViewAdapter extends BaseCardAdapter{

    private List<SwipeCardsViewModel> diyetipuclarimodel;
    private Context context;

    public SwipeCardsViewAdapter(List<SwipeCardsViewModel> diyetipuclarimodel, Context context) {
        this.diyetipuclarimodel = diyetipuclarimodel;
        this.context = context;
    }

    @Override
    public int getCount() {
        return diyetipuclarimodel.size();
    }

    @Override
    public int getCardLayoutId() {
        return R.layout.card_items;
    }

    @Override
    public void onBindData(int position, View cardview) {

        if(diyetipuclarimodel==null || diyetipuclarimodel.size()==0){
            return;
        }

        TextView ipucuozet=cardview.findViewById(R.id.ipucuozet);
        TextView ipucuaciklama=cardview.findViewById(R.id.ipucuAciklama);
        SwipeCardsViewModel diyetipucumodel=diyetipuclarimodel.get(position);
        ipucuozet.setText(diyetipucumodel.getIpucuozet());
        ipucuaciklama.setText(diyetipucumodel.getIpucuaciklama());


    }
}
