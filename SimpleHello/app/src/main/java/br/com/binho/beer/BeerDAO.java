package br.com.binho.beer;

import android.content.ContentValues;
import android.content.Context;

import java.util.List;

/**
 * Created by binho on 26/12/2015.
 */
public class BeerDAO {

    BeerDBHelper helper;

    public BeerDAO(Context context) {
        helper = new BeerDBHelper(context);
    }


    public long criar(Beer beer) {
        ContentValues values = new ContentValues();
        values.put(BeerDBHelper.COLUMN_NAME_NOME, beer.getNome());
        values.put(BeerDBHelper.COLUMN_NAME_IMAGEM, beer.getFoto());
        values.put(BeerDBHelper.COLUMN_NAME_NOTA, beer.getNota());

        long newRowId = helper.getWritableDatabase().insert(BeerDBHelper.TABLE_NAME, null, values);
        return newRowId;
    }


    public long atualizar(Beer beer) {
        ContentValues values = new ContentValues();
        values.put(BeerDBHelper.COLUMN_NAME_NOME, beer.getNome());
        values.put(BeerDBHelper.COLUMN_NAME_IMAGEM, beer.getFoto());
        values.put(BeerDBHelper.COLUMN_NAME_NOTA, beer.getNota());

        long newRowId = helper.getWritableDatabase().update(BeerDBHelper.TABLE_NAME, values,
                BeerDBHelper.COLUMN_NAME_BEER_ID + "=?", new String[]{beer.getId().toString()});
        return newRowId;
    }


    public void deletar(int id) {

    }


    public Beer buscar(int id) {
        return null;
    }


    public List<Beer> listar(int inicio, int porPage) {
        return null;
    }


    public List<Beer> listar(String coluna, String busca, int inicio, int porPage) {
        return null;
    }
}
