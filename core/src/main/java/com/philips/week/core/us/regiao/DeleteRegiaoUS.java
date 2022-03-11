package com.philips.week.core.us.regiao;

import com.philips.week.core.domain.Regiao;
import com.philips.week.core.ports.respository.regiao.RegiaoRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public record DeleteRegiaoUS(
        RegiaoRepositoryPort regiaoRepository,
        FindByIdentifierRegiaoUS findByIdentifierRegiaoUS
) {
    public void apply(String identifier) {
        var regiao = findByIdentifierRegiaoUS.apply(identifier, Regiao.class);
        regiao.deleted(true);
        regiaoRepository.save(regiao);
    }
}
