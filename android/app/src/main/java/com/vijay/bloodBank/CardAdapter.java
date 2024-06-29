package com.vijay.bloodBank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<CardData> cardDataList;
    private Context context;

    public CardAdapter(List<CardData> cardDataList, Context context) {
        this.cardDataList = cardDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardData cardData = cardDataList.get(position);
        holder.name.setText(cardData.getName());
        holder.bloodGroup.setText(cardData.getBloodGroup());
        holder.email.setText(cardData.getEmail());
        holder.mobileNumber.setText(cardData.getMobileNumber());
        holder.location.setText(cardData.getLocation());
    }

    @Override
    public int getItemCount() {
        return cardDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //        public ImageView profileImage;
        public TextView name, bloodGroup, email, mobileNumber, location;
        public Button callButton, shareButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            bloodGroup = itemView.findViewById(R.id.blood_group);
            email = itemView.findViewById(R.id.email_add);
            mobileNumber = itemView.findViewById(R.id.mobile_number);
            location = itemView.findViewById(R.id.location);
            callButton = itemView.findViewById(R.id.call_btn);
            shareButton = itemView.findViewById(R.id.share_btn);
        }
    }
}
