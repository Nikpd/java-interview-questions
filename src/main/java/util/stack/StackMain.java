package main.java.util.stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StackMain {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    add1by1(stack);
    addList(stack);
    addSet(stack);

    stack.pop();
    System.out.println(stack);

    stack.reverse();
    System.out.println(stack);
  }

  private static void addSet(Stack<Integer> stack) {
    Set<Integer> set = new HashSet<>();
    set.add(9);
    set.add(9);
    set.add(10);

    stack.push(set);

    System.out.println(stack);
  }

  private static void addList(Stack<Integer> stack) {
    List<Integer> list = new ArrayList<>();
    list.add(6);
    list.add(7);
    list.add(8);

    stack.push(list);
    System.out.println(stack);
  }

  private static void add1by1(Stack<Integer> stack) {
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack);
  }
}
