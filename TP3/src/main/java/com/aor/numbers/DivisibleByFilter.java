package com.aor.numbers;

public class DivisibleByFilter implements IListFilter {
    int n;

    DivisibleByFilter(int s) {
        n = s;
    }

    public boolean accept(Integer number) {
        return number % n == 0;
    }
}
