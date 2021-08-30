package curtin.edu.madworkshop2final;

import android.os.Bundle;

import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StatusBar extends Fragment {
    TextView healthView, cashView, equipmentView;
    Double newHP;
    public StatusBar(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status_bar, container, false);
        cashView = (TextView)view.findViewById(R.id.cashText);
        cashView.setText("0");
        healthView = (TextView)view.findViewById(R.id.healthText);
        healthView.setText("100");
        equipmentView = (TextView)view.findViewById(R.id.equipmentText);
        equipmentView.setText("0.0");
        return view;
    }

    public double reduceHP(double hp, double currHp)
    {
        newHP = currHp - hp;
        if(newHP >= 0) {
            healthView.setText(String.valueOf(newHP));
        }
        //else game ends
        return newHP;
    }

    public void reset()
    {
        cashView.setText("0");
        healthView.setText("100");
        equipmentView.setText("0");
    }
}