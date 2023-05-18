package reflection.getPackage;

public class GetClass {

    public static void main(String[] args) {
        Class clazz = Car.class;

        Package aPackage = clazz.getPackage();

        System.out.println("패키지: " + aPackage.getName());
        System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름: " + clazz.getName());
    }
}


class Car { }