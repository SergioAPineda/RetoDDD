package co.com.sofka.retoDDD.usecase.celular;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoDDD.domain.celular.Celular;
import co.com.sofka.retoDDD.domain.celular.commands.CrearCelular;

public class CrearCelularUseCase extends UseCase<RequestCommand<CrearCelular>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCelular> crearCelularRequestCommand) {
        var command = crearCelularRequestCommand.getCommand();
        var celular = new Celular(command.getEntityId(), command.getNombreCelular(), command.getPrecio());

        emit().onResponse(new ResponseEvents(celular.getUncommittedChanges()));
    }
}
