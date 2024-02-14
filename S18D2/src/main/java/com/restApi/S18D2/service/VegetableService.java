package com.restApi.S18D2.service;

import com.restApi.S18D2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> getAllVegetables();
    Vegetable getVegetableById(Long id);
    Vegetable saveVegetable(Vegetable vegetable);
    void deleteVegetable(Long id);
    List<Vegetable> getAllVegetablesOrderByPriceDesc();
    List<Vegetable> getAllVegetablesOrderByPriceAsc();
    List<Vegetable> getVegetablesByName(String name);
}
