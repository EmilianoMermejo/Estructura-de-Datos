package fes.aragon.clases;

import java.util.LinkedList;

public class Pila {
    private LinkedList<int[]> stack;

    public Pila() {
        stack = new LinkedList<>();
    }

    public void push(int[] position) {
        stack.push(position);
    }

    public int[] pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int[] peek() {
        return stack.peek();
    }

    public int size() {
        return stack.size();
    }
}
