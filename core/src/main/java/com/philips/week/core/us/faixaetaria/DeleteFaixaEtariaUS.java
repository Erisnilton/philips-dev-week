package com.philips.week.core.us.faixaetaria;

import com.philips.week.core.domain.FaixaEtaria;
import com.philips.week.core.ports.respository.faixaetaria.FaixaEtariaRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public record DeleteFaixaEtariaUS(FaixaEtariaRepositoryPort repository,
                                  FindByIdentifierFaixaEtariaUS findByIdentifierFaixaEtariaUS) {

    public void apply(String identifier) {

        var faixaEtaria = findByIdentifierFaixaEtariaUS.apply(identifier, FaixaEtaria.class);

        faixaEtaria.deleted(true);

        repository.save(faixaEtaria);

    }
}
