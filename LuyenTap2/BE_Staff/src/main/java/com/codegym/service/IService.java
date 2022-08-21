package com.codegym.service;

import java.util.List;

public interface IService<E>{
    List<E> getAll();
    E save(E e);
}
