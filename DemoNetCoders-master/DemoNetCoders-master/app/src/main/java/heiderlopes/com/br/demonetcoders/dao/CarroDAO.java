package heiderlopes.com.br.demonetcoders.dao;

import java.util.List;

import heiderlopes.com.br.demonetcoders.model.Carro;

public interface CarroDAO {

    boolean gravar(Carro carro);
    List<Carro> listarTodos();
    boolean deletar(Carro carro);
    Carro buscarPorId(int id);
}
