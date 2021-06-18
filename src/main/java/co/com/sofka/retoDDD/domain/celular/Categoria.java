package co.com.sofka.retoDDD.domain.celular;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoDDD.domain.celular.values.*;

public class Categoria extends Entity<CategoriaId> {

    protected CategoriaId categoriaId;
    protected Capacidad capacidad;
    protected Gama gama;
    protected Procesador procesador;
    protected Tamaño tamaño;

    public Categoria(CategoriaId categoriaId, Capacidad capacidad, Gama gama, Procesador procesador, Tamaño tamaño) {
        super(categoriaId);
        this.categoriaId = categoriaId;
        this.capacidad = capacidad;
        this.gama = gama;
        this.procesador = procesador;
        this.tamaño = tamaño;
    }

    public CategoriaId categoriaId() {
        return categoriaId;
    }

    public Capacidad capacidad() {
        return capacidad;
    }

    public Gama gama() {
        return gama;
    }

    public Procesador procesador() {
        return procesador;
    }

    public Tamaño tamaño() {
        return tamaño;
    }
}
