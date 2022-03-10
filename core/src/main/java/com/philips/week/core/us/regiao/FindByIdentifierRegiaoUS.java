package com.philips.week.core.us.regiao;

import com.philips.week.core.ports.resposotory.faixaetaria.FaixaEtariaRepositoryPort;
import com.philips.week.core.ports.resposotory.regiao.RegiaoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public record FindByIdentifierRegiaoUS(RegiaoRepositoryPort repository) {

    public <S> S apply(String identifier, Class<S> projection) {

        return repository.findByIdentifier(identifier, projection).orElseThrow(() -> new NoSuchElementException("Região não encontrada."));

    }
}
