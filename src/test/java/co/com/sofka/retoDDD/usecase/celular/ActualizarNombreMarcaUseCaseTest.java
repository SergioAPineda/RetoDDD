package co.com.sofka.retoDDD.usecase.celular;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.retoDDD.domain.celular.Marca;
import co.com.sofka.retoDDD.domain.celular.commands.ActualizarNombreMarca;
import co.com.sofka.retoDDD.domain.celular.events.CategoriaCreada;
import co.com.sofka.retoDDD.domain.celular.events.CelularCreado;
import co.com.sofka.retoDDD.domain.celular.events.MarcaCreada;
import co.com.sofka.retoDDD.domain.celular.events.NombreMarcaActualizado;
import co.com.sofka.retoDDD.domain.celular.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ActualizarNombreMarcaUseCaseTest {

    private ActualizarNombreMarcaUseCase actualizarNombreMarcaUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    private void setup(){
        actualizarNombreMarcaUseCase = new ActualizarNombreMarcaUseCase();
        repository = mock(DomainEventRepository.class);
        actualizarNombreMarcaUseCase.addRepository(repository);
    }

    @Test
    void modificarDescripcionDeComentarioHappyPath(){
        //arrange
        var command = new ActualizarNombreMarca(
                CelularId.of("xxx"),
                MarcaId.of("zzz"),
                new NombreMarca("Samsung")
        );
        when(repository.getEventsBy(any())).thenReturn(events());
        //act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxx")
                .syncExecutor(
                        actualizarNombreMarcaUseCase,
                        new RequestCommand<>(command)
                ).orElseThrow();
        var event = (NombreMarcaActualizado)response.getDomainEvents().get(0);
        //assert
        Assertions.assertEquals("Samsung",event.getNombreMarca().value());
    }

    private List<DomainEvent> events() {
        return List.of(new CelularCreado(
                new NombreCelular("Galaxy S21"),
                new Precio(2900000)
        ),new MarcaCreada(
                MarcaId.of("zzz"),
                new NombreMarca("Apple"),
                new Descuento(0.3)
        ));
    }
}
