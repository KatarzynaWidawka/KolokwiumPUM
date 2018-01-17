package com.example.student.rejestracjawizyt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by student on 2018-01-17.
 */

public class LekarzAdapter  extends RecyclerView.Adapter<LekarzAdapter.ViewHolder> {

    ArrayList<LEKARZ> lekarze = new ArrayList<>();
    LekarzAdapter(ArrayList<LEKARZ>lekarze){this.lekarze=lekarze;}

    @Override
    public LekarzAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(LekarzAdapter.ViewHolder holder, int position) {
        //holder.setNazwalekarza(lekarze.get(position).getNazwa());
        //holder.setSpecjalizacjalekarza(lekarze.get(position).getSpecjalizacja());
    }

    @Override
    public int getItemCount() {
        return lekarze.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.nazwalekarza)
        TextView nazwalekarza;

        @BindView(R.id.specjalizacjalekarza)
        TextView specjalizacjalekarza;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
        //private void setNazwalekarza(String nazwalekarza){nazwalekarza.setText(nazwalekarza);}
        //private void setSpecjalizacjalekarza(String specjalizacjalekarza){specjalizacjalekarza.setText(specjalizacjalekarza);}
    }
}
