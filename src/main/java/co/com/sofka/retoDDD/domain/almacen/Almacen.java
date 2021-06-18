package co.com.sofka.retoDDD.domain.almacen;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.retoDDD.domain.almacen.events.AlmacenCreado;
import co.com.sofka.retoDDD.domain.almacen.values.AlmacenId;
import co.com.sofka.retoDDD.domain.almacen.values.NombreAlmacen;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;

import java.util.Set;

public class Almacen extends AggregateEvent<AlmacenId> {

    protected NombreAlmacen nombreAlmacen;
    protected Set<Bodega> bodegas;
    protected Set<Vendedor> vendedores;
    protected Set<Factura> facturas;
    protected Set<CelularId> celulares;

    public Almacen(AlmacenId almacenId, NombreAlmacen nombreAlmacen) {
        super(almacenId);
        appendChange(new AlmacenCreado(nombreAlmacen)).apply();
    }

    public Almacen(AlmacenId almacenId){
        super(almacenId);
        subscribe(new AlmacenChange(this));
    }


    public NombreAlmacen nombreAlmacen() {
        return nombreAlmacen;
    }
}
