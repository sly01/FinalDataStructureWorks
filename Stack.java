/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class Stack {

    private int size;
    private int[] list;
    private int top;

    public Stack(int boyut) {
        size = boyut;
        list = new int[size];
        top = -1;
    }

    public void push(int j) {

        list[++top] = j;

    }

    public int pop() {

        return list[top--];

    }

    public int peek() {
        return list[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
    public void boyutAll(){
        System.out.println(top);
    }
}
