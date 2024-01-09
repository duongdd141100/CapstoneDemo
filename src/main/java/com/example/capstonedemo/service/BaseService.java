package com.example.capstonedemo.service;

public interface BaseService<T> {
    T create(T object);
    T update(T object);
    Boolean delete(T object);
}
