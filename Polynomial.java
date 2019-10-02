package com.company;

class Polynomial {
    private Set coeff = new Set();

    Polynomial(Set set) throws Exception {
        for(int i = 0; i < set.getSize(); ++i) {
            this.coeff.insert(set.get(i));
        }

    }

    Polynomial() throws Exception {
        Fraction fr = new Fraction();
        this.coeff.insert(fr);
    }

    public Polynomial sum(Polynomial poly) throws Exception {
        Set set = new Set();
        int i;
        if (this.coeff.getSize() > poly.coeff.getSize()) {
            for(i = 0; i < poly.coeff.getSize(); ++i) {
                set.insert(this.coeff.get(i).sum(poly.coeff.get(i)));
            }

            for(i = poly.coeff.getSize(); i < this.coeff.getSize(); ++i) {
                set.insert(this.coeff.get(i));
            }
        } else {
            for(i = 0; i < this.coeff.getSize(); ++i) {
                set.insert(this.coeff.get(i).sum(poly.coeff.get(i)));
            }

            for(i = this.coeff.getSize(); i < poly.coeff.getSize(); ++i) {
                set.insert(poly.coeff.get(i));
            }
        }

        Polynomial res = new Polynomial(set);
        return res;
    }
}
