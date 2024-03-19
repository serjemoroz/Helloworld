package Homework;

public class Pug {

    private String name;
    private int age;
    private String furColor;
    private String size;

    // Конструктор
    public Pug(String name, int age, String furColor, String size) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
        this.size = size;
    }

    // Методы
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getSize() {
        return size;
    }

    // Переопределение метода
    @Override
    public String toString() {
        return "Pug{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", furColor='" + furColor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

