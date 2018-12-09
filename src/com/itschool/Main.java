package com.itschool;


public class Main {

    public static void main(String[] args) {
	   Example_1();
	   Example_2();
	   Example_3();
	   Example_4();
	   Example_5();
	   Example_5_1();
    }

    private static void Example_1(){
        double a = 123456789;
        double shag = 9;

        System.out.println("Резутьтат умножения числа 123456789 на 9, 18, 27...  81.");
        for(int i = 9; i <= 81;i += shag){
            System.out.println("a = "+ a * i);
        }
    }

    private static void Example_2(){
        int m = 7;

        System.out.println("Таблица умножения на 7:");
        for (int i = 1; i <= 10; i++){
            System.out.println(m+" x "+i+" = "+m * i);
        }
    }
    private static void Example_3(){
        double a = 2;

        System.out.println("Программа выводит значения синуса от 2-ух да 20-ти.");
        do{
            System.out.println("sin "+a+" = "+Math.sin(a));
            ++a;
        }while (a<=20);
    }
    private static void Example_4(){
        double x = 2;
        double r = 0;
        double aStep = 0;
        double bFact = 0;
        double yZnak = 1;

        System.out.println("Результат вычисления x - x^3/!3 + x^5/!5 - x^7/!7 + x^9/!9 - x^11/!11 + x^13/!13 по заданному числу х = 2 :");
        for(int i = 1; i <= 13; i+=2){
            if(i==1){
                aStep = x;
                bFact = i;
                r = aStep/bFact;
            }else {
                aStep = aStep * x * x;
                bFact = bFact * i * (i - 1);
                yZnak = yZnak * (-1);
                r = r + (yZnak * (aStep / bFact));
            }
            if(i==13)System.out.println("Результат: "+r);
        }
    }
    private static void Example_5(){
        double x;
        double a = 0;
        double b = 10;
        double h = 2;
        double f;

        System.out.println("Программа выводит результат функции F(x)=tgx");
        System.out.println("Значение x     |     Значение F(x)");
        while (a <= b){
            x = a;
            f = Math.tan(x);
            System.out.println("      "+x+"      |      "+f);
            a += h;
        }
    }
    private static void Example_5_1(){
        double x;
        double a = 0;
        double b = 10;
        double h = 2;
        double f;

        System.out.println("\n\n\nПрограмма выводит результат функции F(x)=ctgx");
        System.out.println("Значение x     |     Значение F(x)");
        while (a <= b){
            x = a;
            f = Math.cos(x)/Math.sin(x);
            System.out.println("      "+x+"      |      "+f);
            a += h;
        }
    }
}
