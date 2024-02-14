package com.restApi.S18D2.service;

import com.restApi.S18D2.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getAllFruits();
    Fruit getFruitById(Long id);
    Fruit saveFruit(Fruit fruit);
    void deleteFruit(Long id);
    List<Fruit> getAllFruitsOrderByPriceDesc();
    List<Fruit> getAllFruitsOrderByPriceAsc();
    List<Fruit> getFruitsByName(String name);
}
