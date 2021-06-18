package co.com.sofka.retoDDD.domain.celular.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;
import co.com.sofka.retoDDD.domain.celular.values.MarcaId;
import co.com.sofka.retoDDD.domain.celular.values.NombreMarca;

public class CrearMarca implements Command {

    private final CelularId celularId;
    private final MarcaId marcaId;
    private final NombreMarca nombreMarca;

    public CrearMarca(CelularId celularId, MarcaId marcaId, NombreMarca nombreMarca) {
        this.celularId = celularId;
        this.marcaId = marcaId;
        this.nombreMarca = nombreMarca;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public MarcaId getMarcaId() {
        return marcaId;
    }

    public NombreMarca getNombreMarca() {
        return nombreMarca;
    }
}
