package org.example.test0710.자바OOP구현문제;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("나이는 0보다 작을 수 없다.");
        } else {
            this.age = age;
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ㅇㅇㅇ");
        person.setAge(-2);
        System.out.println(person.getName() + person.getAge());
    }
}
