package co.com.sofka.retoDDD.domain.celular.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoDDD.domain.celular.values.*;

public class GamaActualizada extends DomainEvent {

    private final CategoriaId categoriaId;
    private final Gama gama;


    public GamaActualizada(CategoriaId categoriaId, Gama gama) {
        super("sofka.celular.gamadefinida");
        this.categoriaId = categoriaId;
        this.gama = gama;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Gama getGama() {
        return gama;
    }


}

