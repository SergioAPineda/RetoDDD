/*
package co.com.sofka.retoDDD.usecase.celular;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoDDD.domain.celular.Celular;
import co.com.sofka.retoDDD.domain.celular.Marca;
import co.com.sofka.retoDDD.domain.celular.commands.CrearMarca;
import co.com.sofka.retoDDD.domain.celular.events.MarcaCreada;

public class CrearMarcaUseCase extends UseCase<RequestCommand<CrearMarca>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearMarca> crearMarcaRequestCommand) {
        var command = crearMarcaRequestCommand.getCommand();
        var celular = Celular.from(command.getCelularId(), retrieveEvents().get());




        emit().onResponse(new ResponseEvents(celular.getUncommittedChanges()));
    }
}
*/
