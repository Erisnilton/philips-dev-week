package com.philips.week.repository.config;

import com.philips.week.core.domain.FaixaEtaria;
import com.philips.week.core.ports.resposotory.faixaetaria.FaixaEtariaRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FaixaEtariaRepository extends MongoRepository<FaixaEtaria, String>, FaixaEtariaRepositoryPort {
}
