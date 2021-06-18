package co.com.sofka.retoDDD.domain.celular;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.retoDDD.domain.celular.values.Descuento;
import co.com.sofka.retoDDD.domain.celular.values.MarcaId;
import co.com.sofka.retoDDD.domain.celular.values.NombreMarca;

import java.util.Objects;

public class Marca extends Entity<MarcaId> {

    protected NombreMarca nombreMarca;
    protected Descuento descuento;

    public Marca(MarcaId entityId, NombreMarca nombreMarca, Descuento descuento) {
      super(entityId);
      this.nombreMarca = nombreMarca;
      this.descuento = descuento;
    }

    public void actualizarNombre(NombreMarca nombreMarca){ this.nombreMarca = Objects.requireNonNull(nombreMarca);}

    public NombreMarca nombreMarca() {
        return nombreMarca;
    }

    public Descuento descuento() { return descuento; }

}
