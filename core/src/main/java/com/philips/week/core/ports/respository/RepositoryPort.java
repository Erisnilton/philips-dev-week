package com.philips.week.core.ports.respository;

import java.util.List;
import java.util.Optional;

public interface RepositoryPort<T> {

    <S extends T> S save(S t);

    <S> Optional<S> findByIdentifierAndDeletedFalse(String identifier, Class<S> projection);

    <S> List<S> findByDeletedFalse(Class<S> projection);

    <S> Optional<S> findByIdentifier(String identifier, Class<S> projection);

}