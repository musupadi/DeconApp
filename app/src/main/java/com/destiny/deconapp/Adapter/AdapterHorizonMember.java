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
import com.destiny.deconapp.Model.Model;
import com.destiny.deconapp.PDFViewerActivity;
import com.destiny.deconapp.R;

import java.util.ArrayList;

public class AdapterHorizonMember extends RecyclerView.Adapter<AdapterHorizonMember.CardViewViewHolder>{
    private Context context;
    private ArrayList<Model> listMember;
    private ArrayList<Model> getListMember() {
        return listMember;
    }
    public void setListMember(ArrayList<Model> listMember) {
        this.listMember = listMember;
    }
    public AdapterHorizonMember(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_horizon_member, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Model p = getListMember().get(i);

//        cardViewViewHolder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        Glide.with(context)
                .load(p.getGambar())
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.nama.setText(p.getNama());
        cardViewViewHolder.pendidikanterakhir.setText(p.getSpesialis());
        cardViewViewHolder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goInput = new Intent(context, PDFViewerActivity.class);
                goInput.putExtra("PDF",p.getCvPDF());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListMember().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        Button detail;
        TextView nama,pendidikanterakhir;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivFotoProfil);
            nama = itemView.findViewById(R.id.tvNama);
            pendidikanterakhir = itemView.findViewById(R.id.tvPendidikanTerakhir);
            detail = itemView.findViewById(R.id.btnDetail);
        }
    }
}




