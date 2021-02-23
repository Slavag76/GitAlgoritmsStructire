package AlgoritmyStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeS {

    public static void main(String[] params) {

        //TODO****************Задали структуру дерева************************
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева: " + sumRecursive(root)); //Рекурсивный обход дерева в глубину
        System.out.println("Сумма дерева: " + sumWide(root)); //Итеративный обход дерева через очередь
        System.out.println("Сумма дерева: " + sumDeep(root)); //Итеративный обход дерева через стэк
    }

    //TODO**************Конструктор дерева********************************
    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }
    }

    //TODO**************Методы обхода дерева *******************************

    public static int sumRecursive(Tree root) {
        int summ = root.value;

        if (root.left != null) {
            summ += sumRecursive(root.left);
        }

        if (root.right != null) {
            summ += sumRecursive(root.right);
        }
        return summ;
    }

    public static int sumDeep(Tree root) {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return summ;
    }

    public static int sumWide(Tree root) {
        Queue<Tree> stack = new LinkedList<>();
        stack.add(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.remove();

            System.out.println(node.value);

            summ = summ + node.value;

            if (node.left != null) {
                stack.add(node.left);
            }

            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return summ;
    }

}
