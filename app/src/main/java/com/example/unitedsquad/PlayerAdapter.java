package com.example.unitedsquad;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {
    private List<Player> playerList;

//  Create a constructor
    public PlayerAdapter(List<Player> playerList) {
        this.playerList = playerList;
    }

//    create new view holders for the items
    /*this method is called by RecyclerView when it needs
   to create a new item view holder for a list item that
   will be displayed on the screen*/
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_layout_list,
                parent,
                false
        );
        return new ViewHolder(view);
    }

//    bind data from the data set to the views within a view holder
    /*this method is called by a RecyclerView when the an item
    * is about to be displayed on the screen*/
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Player player = playerList.get(position);
        holder.playerName.setText(player.getPlayerName());
        holder.playerImage.setImageResource(player.getPlayerImage());
        holder.playerNumber.setText(player.getPlayerNumber());
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView playerImage;
        TextView playerName;
        TextView playerNumber;

        /*ViewHolder is the class that holds the references of the views
        within the item layout.
        It is responsible for improving the performance by avoiding
        redundant findViewById methods calls and efficiently accessing
       updating the views*/
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            playerImage = itemView.findViewById(R.id.imgView1);
            playerName = itemView.findViewById(R.id.txtView1);
            playerNumber = itemView.findViewById(R.id.txtView2);

        }
    }
}
