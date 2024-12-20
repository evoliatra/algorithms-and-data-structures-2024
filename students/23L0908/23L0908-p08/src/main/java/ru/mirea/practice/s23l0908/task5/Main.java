package ru.mirea.practice.s23l0908.task5;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void recursion(int current, int n) {
        if (current > n) {
            return;
        }
        for (int i = 0; i < current; i++) {
            System.out.print(current + " ");
        }
        recursion(++current, n);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter value n: ");
            int n = in.nextInt();
            recursion(0, n);
        }
    }
}
