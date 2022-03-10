package com.philips.week.core.us.faixaetaria;

import com.philips.week.core.ports.resposotory.faixaetaria.FaixaEtariaRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public record FindByIdentifierFaixaEtariaUS(FaixaEtariaRepositoryPort repository) {

    public <S> S apply(String identifier, Class<S> projection) {

        return repository.findByIdentifier(identifier, projection).orElseThrow(() -> new NoSuchElementException("Faixa etária não encontrada."));

    }
}
