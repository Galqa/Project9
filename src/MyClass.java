/* Створіть проект. Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).
 */

public class MyClass<T> {
    private final T instance;

    public MyClass(T instance) {
        this.instance = instance;
    }

    public static <T> MyClass<T> factoryMethod(T instance) {
        return new MyClass<>(instance);
    }

    @Override
    public String toString() {
        return "MyClass instance: " + instance.toString();
    }
}

class Class {
    public static void main(String[] args) {
        MyClass<String> myClassInstance = MyClass.factoryMethod("Smile");
        System.out.println(myClassInstance);
    }
}





