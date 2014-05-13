package myjava.npp.homework;

/**
 * Created by HP on 17.04.2014.
 */
public class Stack<T> {
    private LinkedList<T> list;
    private int size;

    Stack(){
        this.list.add(null);
        this.size = 0;
    }

    Stack(T data){
        this.list.add(data);
        this.size = 1;
    }

    Stack(Stack st){ // конструктор копирования
        while (st.list.peek()!= null){
            this.list.add((T)st.list.peek());
            this.size++;
        }
    }

    public void Push(T data){
        this.list.add(data);
        this.size++;
    }

    public T Pop(){
        this.size--;
        return this.list.remove();
    }

    public T Peek(){
        return this.list.peek();
    }

    public int Size(){
        return this.size;
    }
}
