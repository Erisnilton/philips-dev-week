package com.philips.week.core.us.regiao;

import com.philips.week.core.domain.Regiao;
import com.philips.week.core.ports.respository.regiao.RegiaoRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public record CreateRegiaoUS(RegiaoRepositoryPort repository) {

    public Regiao apply(Regiao regiao) {
        return repository.save(regiao);
    }

}
