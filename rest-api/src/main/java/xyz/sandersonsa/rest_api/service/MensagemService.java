package xyz.sandersonsa.rest_api.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import xyz.sandersonsa.rest_api.model.Mensagem;
import xyz.sandersonsa.rest_api.repository.MensagemRepository;

@Service
@lombok.extern.log4j.Log4j2
public class MensagemService {

    private final MensagemRepository repository;

    public MensagemService(MensagemRepository repository) {
        this.repository = repository;
    }

    public Mensagem salvarMensagem(Mensagem mensagem) {
        try {
            // log.info(" ### Salvar Mensagem: {} ####", mensagem.getUuid());
            return repository.save(mensagem);
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException(" ## Failed to save mensagem: " + e.getMessage());
        }
    }

}
