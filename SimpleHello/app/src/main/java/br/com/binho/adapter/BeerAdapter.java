package br.com.binho.adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.List;

import br.com.binho.beer.Beer;

/**
 * Created by binho on 26/12/2015.
 */
public class BeerAdapter extends BaseAdapter {

    private List<Beer> beers;
    private Context context;

    public BeerAdapter(List<Beer> beers, Context context) {
        this.beers = beers;
        this.context = context;
    }

    @Override
    public int getCount() {
        return beers.size();
    }

    @Override
    public Object getItem(int position) {
        return beers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return beers.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
