package co.com.sofka.retoDDD.usecase.celular.evento;

import co.com.sofka.retoDDD.domain.celular.values.ReceiverId;

public interface ReceiverService {

    String getEmailReceiverById(ReceiverId receiverId);
}
