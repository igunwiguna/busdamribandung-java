package com.example.igunwiguna.damribandung;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtEmail;
    ItemClickListenener itemClickListenener;

    public ListOnlineViewHolder(View itemView) {
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
//        txtEmail.setOnClickListener(this);
    }

    public void setItemClickListenener(ItemClickListenener itemClickListenener) {
        this.itemClickListenener = itemClickListenener;
    }

    @Override
    public void onClick(View view) {
        itemClickListenener.onClick(view,getAdapterPosition());
    }
}
