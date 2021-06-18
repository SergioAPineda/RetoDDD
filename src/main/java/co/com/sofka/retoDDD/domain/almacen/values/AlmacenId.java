package co.com.sofka.retoDDD.domain.almacen.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.retoDDD.domain.celular.values.CelularId;

public class AlmacenId extends Identity {

    public AlmacenId() {
    }

    private AlmacenId(String id){
        super(id);
    }

    public static AlmacenId of(String id){
        return new AlmacenId((id));
    }
}
