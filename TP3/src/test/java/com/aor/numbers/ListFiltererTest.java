package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ListFiltererTest {
    List<Integer> list;
    IListFilter mockPositiveFilter;

    @Before
    public void setup() {
        list = new ArrayList<>();
        list.add(-1);
        list.add(5);
        list.add(-10);
        list.add(3);
        list.add(-2);
        list.add(7);

        mockPositiveFilter = Mockito.mock(IListFilter.class);
        Mockito.when(mockPositiveFilter.accept(Mockito.anyInt())).thenAnswer(i -> ((Integer) i.getArguments()[0] > 0));
    }

    @Test
    public void testListFilter() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(7);

        ListFilterer filterer = new ListFilterer(list);
        List<Integer> res = filterer.filter(mockPositiveFilter);

        assertEquals(expected, res);
    }

    @Test
    public void testPositiveFilter() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(7);

        ListFilterer filterer = new ListFilterer(list);
        List<Integer> res = filterer.filter(new PositiveFilter());

        assertEquals(expected, res);
    }

    @Test
    public void testDivisibleByFilter() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(-10);

        ListFilterer filterer = new ListFilterer(list);
        List<Integer> res = filterer.filter(new DivisibleByFilter(5));

        assertEquals(expected, res);
    }
}
