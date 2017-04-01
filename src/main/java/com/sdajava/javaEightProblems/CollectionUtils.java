package com.sdajava.javaEightProblems;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Andrzej on 01.04.2017.
 */
public class CollectionUtils {

    public static <T> LinkedList<T> linkedList(T... elements){  //metoda statyczna typu generycznego, varargs (przychdza 3 elementy a,b,c
        return Stream.of(elements).collect(Collectors.toCollection(LinkedList::new));  //dodajemy do listy. do streama do kolekcji, typ kolekcji
            // czyli wpopowanie wszystkich elementow
    }
}
