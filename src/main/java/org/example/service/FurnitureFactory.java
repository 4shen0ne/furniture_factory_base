package org.example.service;


import java.util.List;

// ToDo: Feel free to modify return types. Or anything. This is only suggestion
public interface FurnitureFactory {
    List<Object> createFurnitureSet();

    Object createChair();

    Object createBed();

    Object createTable();
}
