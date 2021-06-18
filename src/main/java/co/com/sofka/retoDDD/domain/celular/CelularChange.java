package co.com.sofka.retoDDD.domain.celular;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.retoDDD.domain.celular.events.CelularCreado;
import co.com.sofka.retoDDD.domain.celular.events.MarcaCreada;

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
    }
}
