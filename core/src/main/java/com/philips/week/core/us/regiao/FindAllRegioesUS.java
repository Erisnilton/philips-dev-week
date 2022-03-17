package com.philips.week.core.us.regiao;

import com.philips.week.core.domain.Regiao;
import com.philips.week.core.ports.respository.regiao.RegiaoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record FindAllRegioesUS(RegiaoRepositoryPort repository) {
    public List<Regiao> apply() {
        return repository.findByDeletedFalse(Regiao.class);
    }
}
