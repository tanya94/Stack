package myjava.npp.homework;

/**
 * Created by HP on 16.04.2014.
 */
public class LinkedList<T> implements List<T>  {

    private class Refer<T> {
        T data;
        Refer next;

        private Refer(T data, Refer<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Refer first = null;

    public void add(T data) { // добавление в конец
        Refer temp = first;
        if (first != null) {
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Refer(data,null);
        }
        else
            first = new Refer (data, null);
    }

    public T remove(){ // удаляет последний элемент и возвращает его
        Refer temp = this.first;
        if (this.first == null){
            return null;
        }
        if (this.first.next == null) {
            T value = (T)temp.data;
            temp = null;
            return (T) value;
        }
        while (temp.next.next != null)
            temp = temp.next;
        T val = (T)temp.next.data;
        temp.next = null;

        return (T) val;
    }

    public T peek() { // возвращает последний элемент без удаления
        Refer temp = this.first;
        if (this.first == null) {
            return null;
        }
        while (temp.next != null)
            temp = temp.next;
        return (T) temp.data;
    }
}
