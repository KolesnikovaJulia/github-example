package com.geekbrains;

public class Main {
    public static void main(String[] args) {
            Employee[] workerArray = new Employee[5];
            workerArray[0] = new Employee("Ivanov", "Manadger", "ivan@mail", "11111", 35000, 43);
            workerArray[1] = new Employee("Petrov", "Department", "petr@mail", "22222", 50000, 56);
            workerArray[2] = new Employee("Sidorov", "Assistant", "sidor@mail", "33333", 40000, 45);
            workerArray[3] = new Employee("Kulikov", "Seller", "kulik@mail", "44444", 25000, 20);
            workerArray[4] = new Employee("Vetrov", "Operator", "vetro@mail", "55555", 20000, 18);
            for (int i = 0; i < workerArray.length; i++) {
                if (workerArray[i].age > 40) {
                    System.out.println("Старше 40 лет:" + " " + workerArray[i].name + " - " + "Должность: " + workerArray[i].position + " , " + "E-mail: " + workerArray[i].email + " , " + "Тел: " + workerArray[i].phone + " , " + "Оклад: " + workerArray[i].wage + " , " + "Возраст: " + workerArray[i].age);
                }
            }
        }
        static class Employee {
            String name;
            String position;
            String email;
            String phone;
            int wage;
            int age;

            public Employee(String name, String position, String email, String phone, int wage, int age) {
                this.name = name;
                this.position = position;
                this.email = email;
                this.phone = phone;
                this.wage = wage;
                this.age = age;
            }
        }
    }
