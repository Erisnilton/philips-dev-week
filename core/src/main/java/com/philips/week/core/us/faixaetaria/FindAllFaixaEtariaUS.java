package com.philips.week.core.us.faixaetaria;

import com.philips.week.core.domain.FaixaEtaria;
import com.philips.week.core.ports.respository.faixaetaria.FaixaEtariaRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record FindAllFaixaEtariaUS(FaixaEtariaRepositoryPort repository) {
    public List<FaixaEtaria> apply() {
        return repository.findByDeletedFalse(FaixaEtaria.class);
    }
}
