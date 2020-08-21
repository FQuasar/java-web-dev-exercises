package exercises;

import java.util.Scanner;

public class settersNgetters {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAccount(){
        System.out.println(getName()+", "+getAge());
    }
    public static void main(String[] args) {
        settersNgetters a = new settersNgetters();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String yourName = input.next();
        System.out.print("Enter your age: ");
        int yourAge = input.nextInt();
        a.setName(yourName);
        a.setAge(yourAge);
        a.printAccount();
    }
}
