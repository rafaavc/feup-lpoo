package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

interface IListFilter {
    boolean accept(Integer number);
}

public class ListFilterer {
    private List<Integer> list;
    ListFilterer(List<Integer> l) {
        list = l;
    }

    public List<Integer> filter(IListFilter filter) {
        List<Integer> res = new ArrayList<>();
        for (int n : list) {
            if (filter.accept(n)) res.add(n);
        }
        return res;
    }
}

