import Homework.Pug;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Создаем новый объект класса Pug
        Pug myPug = new Pug("Max", 3, "fawn", "small");

        // Выводим информацию о мопсе
        System.out.println("My pug's name is " + myPug.getName());
        System.out.println("My pug is " + myPug.getAge() + " years old");
        System.out.println("My pug has " + myPug.getFurColor() + " fur");
        System.out.println("My pug is " + myPug.getSize());
    }
}