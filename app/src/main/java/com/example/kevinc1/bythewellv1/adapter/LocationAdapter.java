package com.example.kevinc1.bythewellv1.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.kevinc1.bythewellv1.R;
import com.example.kevinc1.bythewellv1.model.Location;
import com.squareup.picasso.Picasso;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private List<Location> locations;
    private int rowLayout;
    private Context context;


    public LocationAdapter(List<Location> locations, int rowLayout, Context context) {
        this.locations = locations;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public LocationAdapter.LocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new LocationViewHolder(view);
    }


    @Override
    public void onBindViewHolder(LocationViewHolder holder, final int position) {



        holder.positionNumber.setText("Location number : " + String.valueOf(position + 1));
        holder.id.setText("ID :" + locations.get(position).getId());
        holder.name.setText("Name: " + locations.get(position).getName());
        holder.distance.setText("Distance: " + locations.get(position).getDistance());
        holder.latitude.setText("latitude: " + locations.get(position).getLatitude());
        holder.longitude.setText("Longitude: " + locations.get(position).getLongitude());
        String url= getMapURL(locations.get(position).getLatitude(),locations.get(position).getLongitude());
//        Picasso.get().load(url).into(map);

    }

    @Override
    public int getItemCount() {
        return locations.size();
    }



    public String getMapURL(String latitude, String longitude)
    {
        return ("http://maps.googleapis.com/maps/api/staticmap?zoom=18&size=560x240&markers=size:mid|color:red|"
            + latitude
            + ","
            + longitude
            + "&sensor=false");
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder {
        TextView positionNumber;
        TextView id;
        TextView name;
        TextView distance;
        TextView latitude;
        TextView longitude;
        ImageView map;



        public LocationViewHolder(View v) {
            super(v);
            positionNumber = (TextView) v.findViewById(R.id.positionNumber);
            id = (TextView) v.findViewById(R.id.id);
            name = (TextView) v.findViewById(R.id.name);
            distance = (TextView) v.findViewById(R.id.distance);
            latitude = (TextView) v.findViewById(R.id.latitude);
            longitude = (TextView) v.findViewById(R.id.longitude);
           // map = (ImageView) v.findViewById(R.id.map);
        }
    }
}

