package net.oliversne.sportsapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.oliversne.sportsapp.Models.Sport;
import net.oliversne.sportsapp.R;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {

    private List<Sport> sportList;

    public SportAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        public SportViewHolder(@NonNull View context) {
            super(context);
            textView = context.findViewById(R.id.card_text_view);
            imageView = context.findViewById(R.id.card_image_view);
        }
    }

    @NonNull
    @Override
    public SportAdapter.SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View sportView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout, parent, false);
        return new SportViewHolder(sportView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportAdapter.SportViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.textView.setText(sport.getSportName());
        holder.imageView.setImageResource(sport.getSportImg());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


}
