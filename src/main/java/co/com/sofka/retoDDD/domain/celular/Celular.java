package co.com.sofka.retoDDD.domain.celular;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.retoDDD.domain.celular.events.CelularCreado;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;
import co.com.sofka.retoDDD.domain.celular.values.NombreCelular;
import co.com.sofka.retoDDD.domain.celular.values.Precio;

import java.util.Set;

public class Celular extends AggregateEvent<CelularId> {

    protected NombreCelular nombreCelular;
    protected Precio precio;
    protected Set<Marca> marcas;
    protected Set<Categoria> categorias;
    protected Set<Operador> operadores;

    public Celular(CelularId entityId, NombreCelular nombreCelular, Precio precio) {

        super(entityId);
        appendChange(new CelularCreado(nombreCelular, precio)).apply();
    }

    public NombreCelular nombreCelular() {
        return nombreCelular;
    }

    public Precio precio() {
        return precio;
    }
}
