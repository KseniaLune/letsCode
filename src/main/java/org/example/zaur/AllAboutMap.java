package org.example.zaur;

import java.util.*;

public class AllAboutMap {
   private Collection collection;
  private   Collections collections;


    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"JS");
        map.put(3,"TS");
        map.put(4,"GoLang");
        map.put(5,"Rust");

        map.putIfAbsent(6, "Kotlin");
        map.putIfAbsent(2, "Kotlin");//добавит, если ключ свободен

        System.out.println(map.containsKey(1)); //bool содержит ли ключ
        System.out.println(map.containsValue("Java")); //bool содержит ли значение
        System.out.println(map.keySet()); //выводит Set всех ключей
        System.out.println(map.values());//выводит Collection всех значений


        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    class Student{
        private String name;
        private int age;
        private char litera;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (age != student.age) return false;
            if (litera != student.litera) return false;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + age;
            result = 31 * result + (int) litera;
            return result;
        }
    }
}
