package com.philips.week.core.ports.respository;

import java.util.Optional;

public interface RepositoryPort<T> {

    <S extends T> S save(S t);

    <S> Optional<S> findByIdentifier(String identifier, Class<S> projection);

}