package co.com.sofka.retoDDD.domain.celular.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoDDD.domain.celular.values.CategoriaId;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;
import co.com.sofka.retoDDD.domain.celular.values.Gama;

public class ActualizarGama implements Command {

    private final CelularId celularId;
    private final CategoriaId categoriaId;
    private final Gama gama;

    public ActualizarGama(CelularId celularId, CategoriaId categoriaId, Gama gama) {
        this.celularId = celularId;
        this.categoriaId = categoriaId;
        this.gama = gama;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Gama getGama() {
        return gama;
    }
}
