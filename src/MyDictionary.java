/* Створіть клас MyDictionary<TKey,TValue>. В цьому класі необхідно створити поле типу
List<Pair<TKey,TValue>>, який містить об'єкти рекорду Pair<TKey,TValue>.
Реалізуйте інтерфейс взаємодії з екземпляром, який має містити
метод додавання пар елементів, індексатор для отримання значення елемента за вказаним індексом і
властивість тільки для читання для отримання загальної кількості пар елементів.
*/

import java.util.ArrayList;
import java.util.List;

class Pair<TKey, TValue> {
    private TKey key;
    private TValue value;

    public Pair(TKey key, TValue value) {
        this.key = key;
        this.value = value;
    }

    public TKey getKey() {
        return key;
    }

    public void setKey(TKey key) {
        this.key = key;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }
}

public class MyDictionary<TKey, TValue> {
    private List<Pair<TKey, TValue>> list;

    public MyDictionary() {
        list = new ArrayList<>();
    }

    public void add(TKey key, TValue value) {
        list.add(new Pair<>(key, value));
    }

    public TValue get(int index) {
        return list.get(index).getValue();
    }

    public int size() {
        return list.size();
    }
}

class Dictionary {
    public static void main(String[] args) {
        MyDictionary<String, Integer> dictionary = new MyDictionary<>();
        dictionary.add("no", 1);
        dictionary.add("yes", 2);
        dictionary.add("maybe", 3);
        // значення елементів за вказаними індексами
        System.out.println(" no " + dictionary.get(0)); // 1
        System.out.println(" yes " + dictionary.get(1)); // 2
        System.out.println(" maybe " + dictionary.get(2)); // 3
        // загальна кількість пар елементів
        System.out.println(dictionary.size()); // 3
    }
}


