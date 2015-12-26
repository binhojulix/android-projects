package heiderlopes.com.br.demonetcoders.dao;

import java.util.ArrayList;
import java.util.List;

import heiderlopes.com.br.demonetcoders.model.Carro;

public class CarroDAOImpl implements CarroDAO {

    private static List<Carro> carros
            = new ArrayList<>();

    @Override
    public boolean gravar(Carro carro) {
        if(carro.getId() == 0) {
            carro.setId(carros.size() + 1);
            carros.add(carro);
        } else {
            carros.get(carro.getId() - 1).setFabricacao(carro.getFabricacao());
            carros.get(carro.getId() - 1).setModelo(carro.getModelo());
            carros.get(carro.getId() - 1).setCombustivel(carro.getCombustivel());
            carros.get(carro.getId() - 1).setMarca(carro.getMarca());
            carros.get(carro.getId() - 1).setPlaca(carro.getPlaca());
        }
        return true;
    }

    @Override
    public List<Carro> listarTodos() {
        return carros;
    }

    @Override
    public boolean deletar(Carro carro) {
        carros.remove(carro);
        return true;
    }

    @Override
    public Carro buscarPorId(int id) {
        return carros.get(id);
    }
}
