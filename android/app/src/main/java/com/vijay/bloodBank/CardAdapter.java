package com.vijay.bloodBank;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
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
        holder.callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + cardData.getMobileNumber()));

                if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.CALL_PHONE}, 1);
                else
                    context.startActivity(callIntent);

            }
        });

        holder.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareContent = "Name: " + cardData.getName() + "\n" +
                        "Blood Group: " + cardData.getBloodGroup() + "\n" +
                        "Email: " + cardData.getEmail() + "\n" +
                        "Mobile Number: " + cardData.getMobileNumber() + "\n" +
                        "Location: " + cardData.getLocation();

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareContent);
                context.startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });

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
