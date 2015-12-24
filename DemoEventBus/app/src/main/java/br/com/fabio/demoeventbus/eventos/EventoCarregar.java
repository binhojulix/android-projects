package br.com.fabio.demoeventbus.eventos;

/**
 * Created by rm40246 on 10/12/2015.
 */
public class EventoCarregar {

    private String data;

    public EventoCarregar(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}
