package com.philips.week.repository.config;

import com.philips.week.core.domain.Regiao;
import com.philips.week.core.ports.resposotory.regiao.RegiaoRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegiaoRepository extends MongoRepository<Regiao, String>, RegiaoRepositoryPort {
}
