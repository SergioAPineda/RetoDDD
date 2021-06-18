package co.com.sofka.retoDDD.domain.celular;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.retoDDD.domain.celular.values.Capacidad;
import co.com.sofka.retoDDD.domain.celular.values.Gama;
import co.com.sofka.retoDDD.domain.celular.values.Procesador;
import co.com.sofka.retoDDD.domain.celular.values.Tamaño;

public class Operador extends Entity {

    private final Gama gama;
    private final Procesador procesador;
    private final Capacidad capacidad;
    private final Tamaño tamaño;

    public Operador(Identity entityId, Gama gama, Procesador procesador, Capacidad capacidad, Tamaño tamaño) {

        super(entityId);
        this.gama = gama;
        this.procesador = procesador;
        this.capacidad = capacidad;
        this.tamaño = tamaño;
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
