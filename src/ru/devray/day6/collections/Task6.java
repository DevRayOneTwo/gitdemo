package ru.devray.day6.collections;

import java.util.*;

/**
 * Задание 6.1 (для классной работы)
 * Создать массив цветов (минимум 7 позиций).
 * Сконвертировать массив в список (ArrayList).
 * Вывести на экран весь список с помощью итератора.
 * Отсортировать список по алфавиту.
 * Заменить элементы списка на позициях 1, 3, 5 на аналогичные, но с приставкой + "Dark ".
 * Вывести на экран весь список с помощью for-each цикла.
 * Получить под-список с 1 по 5 элементы включительно.
 * Написать метод, который поменяет местами 1 и 4 элементы межды собой.
 * Получить элемент с индексом 3, сохранить в переменную а1.
 * Проверить, содержится ли объект из переменной а1 в коллекции.
 * Удалить все элементы, содержащие букву 'o'
 * Превратить список в массив.
 */
public class Task6 {
    public static void main(String[] args) {
        //Создать массив цветов (минимум 7 позиций).
        String[] colors = {"aaodfsdfs", "baored", "blueo", "pinko", "violet", "green", "yellow", "black", "white"};

        //Сконвертировать массив в список (ArrayList).
        List<String> list = new ArrayList<>(Arrays.asList(colors)); //LinkedList
        Object o = new String();

        //for-each
//        for (String s : list){
//            System.out.println(s);
//        }

        //Вывести на экран весь список с помощью итератора.
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Отсортировать список по алфавиту.
        Collections.sort(list);
        System.out.println(list);

        //Заменить элементы списка на позициях 1, 3, 5 на аналогичные, но с приставкой + "Dark ".
        for(int i = 0; i <= 4; i+=2){
            list.set(i, "Dark "+ list.get(i));
        }

        System.out.println(list);

        //Написать метод, который поменяет местами 1 и 4 элементы межды собой.
//        String temporary = list.get(0);
//
//        list.set(0, list.get(3));
//        list.set(3, temporary);

        Collections.swap(list, 0, 3);

        System.out.println("===");
        System.out.println(list);

        //List<String> anotherList = List.of("yellow", "viosdflet", "pink"); //Immutable List
//        anotherList.add("");
//
//        System.out.println(list.containsAll(anotherList));

        for(int i=0; i < list.size(); ){
            if (list.get(i).contains("o")){
                list.remove(i);
            } else {
                i++;
            }
        }

//        for(String s : list){
//            if (s.contains("o")){
//                list.remove(s);
//            }
//        }

        System.out.println(list);

    }
}
