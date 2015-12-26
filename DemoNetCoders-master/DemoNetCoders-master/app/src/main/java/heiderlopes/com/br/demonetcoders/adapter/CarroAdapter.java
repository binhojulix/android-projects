package heiderlopes.com.br.demonetcoders.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import heiderlopes.com.br.demonetcoders.R;
import heiderlopes.com.br.demonetcoders.model.Carro;

public class CarroAdapter extends BaseAdapter {

    private Context context;
    private List<Carro> carros;
    private LayoutInflater inflater = null;

    public CarroAdapter(Context context,
                        List<Carro> carros) {
        this.context = context;
        this.carros = carros;
        inflater = (LayoutInflater) context
                .getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return carros.get(position).getId();
    }

    public class Holder {
        TextView tvTitulo;
        TextView tvSubTitulo;
        ImageView ivIcone;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();
        View row;

        row = inflater.inflate(R.layout.carro_row,
                viewGroup, false);

        holder.tvTitulo =
                (TextView)row.findViewById(R.id.tvTitulo);
        holder.tvSubTitulo =
                (TextView) row.findViewById(R.id.tvSubTitulo);
        holder.ivIcone = (ImageView)row.findViewById(R.id.ivIcone);

        holder.tvTitulo.setText(carros.get(position)
                .getMarca());

        holder.tvSubTitulo.setText(
                String.valueOf(carros.get(position).getFabricacao())
                        + "/"
                        + String.valueOf(carros.get(position).getModelo()));

        //holder.ivIcone.setImageResource(R.drawable.ic_action_save);

        return row;
    }
}
