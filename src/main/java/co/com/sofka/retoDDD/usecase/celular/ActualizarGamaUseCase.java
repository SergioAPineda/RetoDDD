package co.com.sofka.retoDDD.usecase.celular;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.retoDDD.domain.celular.Celular;
import co.com.sofka.retoDDD.domain.celular.commands.ActualizarGama;

public class ActualizarGamaUseCase extends UseCase<RequestCommand<ActualizarGama>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarGama> actualizarGamaRequestCommand) {
        var command = actualizarGamaRequestCommand.getCommand();
        var celular = Celular.from(command.getCelularId(), retrieveEvents(command.getCelularId().value()));

        celular.actualizarGama(command.getCategoriaId(), command.getGama(), command.getReceiverId());

        emit().onResponse(new ResponseEvents(celular.getUncommittedChanges()));
    }
}
