package com.example.capstonedemo.service;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();
    T create(T object);
    T update(Integer id, T object);
    Boolean delete(Integer id);
}
