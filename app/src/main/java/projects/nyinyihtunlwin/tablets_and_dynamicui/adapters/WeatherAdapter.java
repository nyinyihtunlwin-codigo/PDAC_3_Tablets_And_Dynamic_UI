package projects.nyinyihtunlwin.tablets_and_dynamicui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import projects.nyinyihtunlwin.tablets_and_dynamicui.R;
import projects.nyinyihtunlwin.tablets_and_dynamicui.viewholders.WeatherViewHolder;

/**
 * Created by Dell on 12/2/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {

    private Context context;
    private LayoutInflater inflater;

    public WeatherAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_item_weather, parent, false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
