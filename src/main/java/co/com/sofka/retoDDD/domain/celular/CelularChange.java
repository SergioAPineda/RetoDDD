package co.com.sofka.retoDDD.domain.celular;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.retoDDD.domain.celular.events.*;
import co.com.sofka.retoDDD.domain.celular.values.CategoriaId;

import java.util.HashSet;

public class CelularChange extends EventChange {
    public CelularChange(Celular celular) {

        apply((CelularCreado event) -> {
            celular.nombreCelular = event.getNombreCelular();
            celular.precio = event.getPrecio();
            celular.marcas = new HashSet<>();
            celular.categorias = new HashSet<>();
            celular.operadores = new HashSet<>();
        });

        apply((MarcaCreada event) ->{
            var marca = new Marca(
                    event.getMarcaId(),
                    event.getNombreMarca(),
                    event.getDescuento()
            );
            celular.marcas.add(marca);
        });

        apply((CategoriaCreada event) ->{
            var categoria = new Categoria(
                    event.getCategoriaId(),
                    event.getCapacidad(),
                    event.getGama(),
                    event.getProcesador(),
                    event.getTamaño()
            );
            celular.categorias.add(categoria);
        });

        apply((OperadorCreado event) ->{
            var operador = new Operador(
                    event.getOperadorId(),
                    event.getTipoServicio(),
                    event.getValorPlan(),
                    event.getNombreOperador()
            );
            celular.operadores.add(operador);
        });
    }
}
