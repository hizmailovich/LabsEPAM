package by.epam.dao;

import by.epam.exceptions.DaoException;

import java.util.List;
import java.util.Optional;

public interface IDao<T> {
    List<T> findAll(int limit, int offset) throws DaoException;

    Optional<T> findById(long id) throws DaoException;

    void delete(long id) throws DaoException;

    void create(T entity) throws DaoException;

    void update(T entity) throws DaoException;
}