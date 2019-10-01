package com.company;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

class Set {
    private ArrayList<Fraction> fractions = new ArrayList();
    private Fraction max = null;
    private Fraction min = null;
    private Hashtable<Fraction, Integer> cashMax = new Hashtable();
    private Hashtable<Fraction, Integer> cashMin = new Hashtable();

    Set() throws Exception {
    }

    public void insert(Fraction fr) {
        this.fractions.add(fr);
        if (this.max == null) {
            this.max = fr;
        } else if (fr.compare(this.max) == 1) {
            this.max = fr;
        }

        if (this.min == null) {
            this.min = fr;
        } else if (fr.compare(this.min) == -1) {
            this.min = fr;
        }

    }

    public Fraction max() throws Exception {
        if (this.fractions.isEmpty()) {
            throw new Exception("Массив пуст");
        } else {
            return this.max;
        }
    }

    public Fraction min() {
        if (this.fractions.isEmpty()) {
            System.out.println("Массив пуст");
            return this.min;
        } else {
            return this.min;
        }
    }

    public int countMax(Fraction n) {
        int count = 0;
        Iterator var3 = this.fractions.iterator();

        while(var3.hasNext()) {
            Fraction fr = (Fraction)var3.next();
            if (fr.compare(n) == 1) {
                ++count;
            }
        }

        return count;
    }

    public int countMin(Fraction n) {
        int count = 0;
        Iterator var3 = this.fractions.iterator();

        while(var3.hasNext()) {
            Fraction fr = (Fraction)var3.next();
            if (fr.compare(n) == -1) {
                ++count;
            }
        }

        return count;
    }

    public int getSize() {
        return this.fractions.size();
    }

    public Fraction get(int i) {
        return (Fraction)this.fractions.get(i);
    }
}
