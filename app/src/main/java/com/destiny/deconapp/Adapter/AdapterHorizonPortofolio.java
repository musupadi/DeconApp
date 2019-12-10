package com.destiny.deconapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.destiny.deconapp.DetailPortofolioActivity;
import com.destiny.deconapp.Model.Model;
import com.destiny.deconapp.R;

import java.util.ArrayList;

public class AdapterHorizonPortofolio extends RecyclerView.Adapter<AdapterHorizonPortofolio.CardViewViewHolder>{
    private Context context;
    private ArrayList<Model> listPortofolio;
    private ArrayList<Model> getListPortofolio() {
        return listPortofolio;
    }
    public void setListPortofolio(ArrayList<Model> listPortofolio) {
        this.listPortofolio = listPortofolio;
    }
    public AdapterHorizonPortofolio(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_horizon_portofolio, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Model p = getListPortofolio().get(i);
//        cardViewViewHolder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        Glide.with(context)
                .load(p.getImgapps1())
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.nama.setText(p.getAppsname());
        cardViewViewHolder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(context, DetailPortofolioActivity.class);
                goInput.putExtra("NAMA",p.getAppsname());
                goInput.putExtra("PLATFORM",p.getPlatform());
                goInput.putExtra("FEATURE",p.getFeature());
                goInput.putExtra("STATUS",p.getStatus());
                goInput.putExtra("LINK",p.getLink());
                goInput.putExtra("IMG1",p.getImgapps1());
                goInput.putExtra("ABOUT1",p.getAboutimage1());
                goInput.putExtra("IMG2",p.getImgapps2());
                goInput.putExtra("ABOUT2",p.getAboutimage2());
                goInput.putExtra("IMG3",p.getImgapps3());
                goInput.putExtra("ABOUT3",p.getAboutimage3());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPortofolio().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        Button detail;
        TextView nama;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivFoto1);
            nama = itemView.findViewById(R.id.tvNamaAplikasi);
            detail = itemView.findViewById(R.id.btnDetail);
        }
    }
}

