package co.com.sofka.retoDDD.domain.celular.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoDDD.domain.celular.values.CategoriaId;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;
import co.com.sofka.retoDDD.domain.celular.values.Procesador;

public class ActualizarProcesador implements Command {

    private final CelularId celularId;
    private final CategoriaId categoriaId;
    private final Procesador procesador;

    public ActualizarProcesador(CelularId celularId, CategoriaId categoriaId, Procesador procesador) {
        this.celularId = celularId;
        this.categoriaId = categoriaId;
        this.procesador = procesador;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Procesador getProcesador() {
        return procesador;
    }
}
