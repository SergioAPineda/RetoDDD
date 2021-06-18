package co.com.sofka.retoDDD.usecase.celular;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoDDD.domain.celular.Celular;
import co.com.sofka.retoDDD.domain.celular.commands.ActualizarNombreCelular;
import co.com.sofka.retoDDD.domain.celular.commands.CrearCelular;

public class ActualizarNombreCelularUseCase extends UseCase<RequestCommand<ActualizarNombreCelular>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCelular> actualizarNombreCelularRequestCommand) {
        var command = actualizarNombreCelularRequestCommand.getCommand();
        var celular = Celular.from(command.getCelularId(),retrieveEvents(command.getCelularId().value()));

        celular.actualizarNombreCelular(command.getCelularId(), command.getNombreCelular());

        emit().onResponse(new ResponseEvents(celular.getUncommittedChanges()));
    }
}
