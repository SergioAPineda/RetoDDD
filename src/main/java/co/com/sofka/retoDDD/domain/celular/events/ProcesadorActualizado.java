package co.com.sofka.retoDDD.domain.celular.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoDDD.domain.celular.values.CategoriaId;
import co.com.sofka.retoDDD.domain.celular.values.Procesador;

public class ProcesadorActualizado extends DomainEvent {
    private final CategoriaId categoriaId;
    private final Procesador procesador;

    public ProcesadorActualizado(CategoriaId categoriaId, Procesador procesador) {
        super("sofka.celular.procesadoractualizado");
        this.categoriaId = categoriaId;
        this.procesador = procesador;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Procesador getProcesador() {
        return procesador;
    }
}
