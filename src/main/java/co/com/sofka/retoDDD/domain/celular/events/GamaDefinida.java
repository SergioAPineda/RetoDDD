package co.com.sofka.retoDDD.domain.celular.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoDDD.domain.celular.values.*;

public class GamaDefinida extends DomainEvent {

    private final CategoriaId categoriaId;
    private final Gama gama;
    private final Procesador procesador;
    private final Capacidad capacidad;
    private final Tamaño tamaño;

    public GamaDefinida(CategoriaId categoriaId, Gama gama, Procesador procesador, Capacidad capacidad, Tamaño tamaño) {
        super("sofka.celular.gamadefinida");
        this.categoriaId = categoriaId;
        this.gama = gama;
        this.procesador = procesador;
        this.capacidad = capacidad;
        this.tamaño = tamaño;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Gama getGama() {
        return gama;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }
}
