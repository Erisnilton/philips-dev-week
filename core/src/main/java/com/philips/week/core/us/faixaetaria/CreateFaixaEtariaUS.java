package com.philips.week.core.us.faixaetaria;

import com.philips.week.core.domain.FaixaEtaria;
import com.philips.week.core.ports.resposotory.faixaetaria.FaixaEtariaRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public record CreateFaixaEtariaUS(FaixaEtariaRepositoryPort repository) {

    public FaixaEtaria apply(FaixaEtaria faixaEtaria) {
        return repository.save(faixaEtaria);
    }

}
