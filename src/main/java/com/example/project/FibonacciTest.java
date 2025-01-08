package com.example.project;

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibo1 = new Fibonacci(10);
        String fibo1sequence = ArrayPrinter.printableString(fibo1.getSequence());
        System.out.println(fibo1sequence);
        boolean bool1 = fibo1sequence.equals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]");
        System.out.println(bool1);
        System.out.println(fibo1.getIndexOf(0));

        System.out.println("-----");

        Fibonacci fibo2 = new Fibonacci(8);
        String fibo2sequence = ArrayPrinter.printableString(fibo2.getSequence());
        System.out.println(fibo2sequence);
        boolean bool2 = fibo2sequence.equals("[0, 1, 1, 2, 3, 5, 8, 13]");
        System.out.println(bool2);

        fibo2.extendBy(2);
        fibo2sequence = ArrayPrinter.printableString(fibo2.getSequence());
        System.out.println(fibo2sequence);
        bool2 = fibo2sequence.equals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]");
        System.out.println(bool2);

        System.out.println("-----");

        Fibonacci fib3 = new Fibonacci(5);
        System.out.println(fib3.fibonacciString());

        int[] seq3 = fib3.getSequence();
        seq3[0] = 100;

        System.out.println(fib3.fibonacciString());

        System.out.println("-----");
        
        Fibonacci fib0 = new Fibonacci(5);
        Fibonacci fib1 = new Fibonacci(11);
        Fibonacci fib2 = new Fibonacci(20);
        Fibonacci[] fibonaccis = {fib0, fib1, fib2};
        for (Fibonacci fibonacci : fibonaccis) {
            System.out.println(fibonacci.getSequence().length);
        }
    }
}

