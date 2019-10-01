package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Set set1 = new Set();
        set1.insert(new Fraction(1, 2));
        set1.insert(new Fraction(-2, 6));
        set1.insert(new Fraction(-9, 3));
        Set set2 = new Set();
        set2.insert(new Fraction(4, 3));
        set2.insert(new Fraction(7, 8));
        Fraction max = set1.max();
        Fraction min = set1.min();
        int i = set1.countMax(new Fraction(0));
        int j = set1.countMin(new Fraction(0));
        System.out.print("Максимальный коэффициент: ");
        max.print();
        System.out.print("Минимальный коэффициент: ");
        min.print();
        System.out.printf("Количество чисел больше заданного: %d\nКоличество чисел меньше заданного: %d\n", i, j);
        Polynomial pol1 = new Polynomial(set1);
        Polynomial pol2 = new Polynomial(set2);
        Polynomial pol3 = pol1.sum(pol2);
        System.out.println("Коэффициенты первого полинома:");
        pol1.printf();
        System.out.println("Коэффициенты второго полинома:");
        pol2.printf();
        System.out.println("Коэффициенты результирующего полинома:");
        pol3.printf();

        
    }
}
