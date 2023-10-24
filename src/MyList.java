/* Створіть проект. Cтворіть клас MyList.
 Реалізуйте у найпростішому наближенні можливість використання його екземпляра аналогічно екземпляру класу List.
 Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
 індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної кількості елементів.
 */

public class MyList<T> {
    private T[] array;
    private int size;

    public MyList(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            // створюємо новий масив з подвоєним розміром
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    public T get(int index) {
        // перевіряємо чи індекс не виходит за межі масиву
        if (index < 0 || index >= size) {
            // якщо так, то кидаємо виняток
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        // повертаємо значення елемента за індексом
        return array[index];
    }

    public void set(int index, T element) {
        // перевіряємо, чи індекс не виходить за межі масиву
        if (index < 0 || index >= size) {
            // якщо так, то кидаємо виняток
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        array[index] = element;
    }

    public int getSize() {
        return size;
    }
}


class List {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(8);
        // додаємо деякі елементи в список
        myList.add("Saturn");
        myList.add("Mars");
        myList.add("Jupiter");
        myList.add("Mercury");
        myList.add("Uranus");
        myList.add("Pluto");
        myList.add("Neptune");
        myList.add("Venus");
        // виводимо кількість елементів в списку
        System.out.println("Size: " + myList.getSize());
        // виводимо значення елементів за індексами
        System.out.println("Element at 0: " + myList.get(0));
        System.out.println("Element at 1: " + myList.get(1));
        System.out.println("Element at 2: " + myList.get(2));
        System.out.println("Element at 3: " + myList.get(3));
        System.out.println("Element at 4: " + myList.get(4));
        System.out.println("Element at 5: " + myList.get(5));
        System.out.println("Element at 6: " + myList.get(6));
        System.out.println("Element at 7: " + myList.get(7));
        // змінюємо значення елемента за індексом
        myList.set(2, "Java");
        // виводимо змінене значення
        System.out.println("Element at 2: " + myList.get(2));
    }
}














