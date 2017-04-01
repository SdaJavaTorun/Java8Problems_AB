package com.sdajava.javaEightProblems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 * Created by Andrzej on 01.04.2017.
 */
public class ArrayExec {

    public static <T> T last(List<T> elements){
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }

    public static <T> T last(LinkedList<T> elements) {
        return elements.getLast();    //linkedList posiada metode get.Last
    }



    public static <T> long  length(List<T> list) {

        //return list.size();   //lub
        return list.stream().count();
    }

    public static <T> List<T> revarse(List<T> list){

        Collections.reverse(list);
        return list;
        //return Collections.reverseOrder(numbers.clone());
       // return Arrays.sort(number, Collections.reverseOrder(numbers));
    }
    public static <T> List<T> revarseStream(List<T> list){
        int size = list.size();
        return IntStream.iterate(size -1, el -> el -1)
                .limit(size).mapToObj(list::get).collect(toList());
    }

    public static <T> boolean isPalindrome(List<T> list){
        List<T> original = new ArrayList<T>(list);
        ArrayExec.revarse(list);
        return Objects.equals(list, original);
    }

        public static <T> List<T> compress (List<T> list) {

        TreeSet<T> set = new TreeSet<>(list);

        List<T> listAfter = new ArrayList<>();
        for (T tempSet: set)
            listAfter.add(tempSet);

        return listAfter;
        //    return list.stream().distinct().collect(Collectors.toList());
    }

   

    }





}
