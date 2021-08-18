package ru.devray.day6.collections;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {

        List<? extends Visitor> list = new ArrayList<>();

        List<Employee> listEmployees = List.of(new Employee());
        List<Student> listStudent = List.of(new Student());

        list.addAll(listEmployees);
        list = listEmployees;


    }
}
