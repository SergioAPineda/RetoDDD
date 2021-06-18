package co.com.sofka.retoDDD.domain.celular.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;
import co.com.sofka.retoDDD.domain.celular.values.NombreCelular;

public class ActualizarNombreCelular implements Command {

    CelularId celularId;
    NombreCelular nombreCelular;

    public ActualizarNombreCelular(CelularId celularId, NombreCelular nombreCelular) {
        this.celularId = celularId;
        this.nombreCelular = nombreCelular;
    }

    public CelularId getCelularId() {
        return celularId;
    }

    public NombreCelular getNombreCelular() {
        return nombreCelular;
    }
}
