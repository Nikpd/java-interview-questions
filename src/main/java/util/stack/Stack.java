package main.java.util.stack;

import java.util.Collection;

public class Stack<T>{
  Node<T> top;
  Node<T> prev;

  public void push(T val) {
    Node<T> node = new Node<>(val);
    if(top != null) {
      prev = top;
    }
    top = node;
    top.next = prev;
  }

  public void push(Collection<T> collection) {
    collection.forEach(this::push);
  }

  public T pop() {
    T val = top.value;
    System.out.println("Popping " + val);
    top = prev;
    return val;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    if(top == null) {
      return "Stack is empty";
    }

    Node<T> temp = top;
    while (temp != null) {
      sb.append(temp.value).append(", ");
      temp = temp.next;
    }
    sb.replace(sb.length() -2, sb.length() - 1, "");
    return sb.toString();
  }

  public void reverse() {
    if(top == null) {
      throw new RuntimeException("Can not reverse an empty stack");
    }

    Node<T> curr = top;
    Node<T> prev = null;
    Node<T> next;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    top = prev;
  }
}
