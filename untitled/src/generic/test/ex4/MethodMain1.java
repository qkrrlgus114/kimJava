package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object o = GenericMethod.objMethod(i);

        System.out.println("명시적 타입 인자 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(i);

        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

    }
}
