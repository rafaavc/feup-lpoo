package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListAggregatorTest {
    private List<Integer> list;

    @Before
    public void setup() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
    }

    @Test
    public void sum() {
        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {
        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void max1() {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-4);
        list.add(-5);
        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(-1, max);
    }

    @Test
    public void min() {
        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct() {
        ListAggregator aggregator = new ListAggregator(list);

        class Stub implements IListDeduplicator {
            public List<Integer> deduplicate(IListSorter s) {
                List<Integer> l = new ArrayList<>();
                l.add(1);
                l.add(2);
                l.add(4);
                l.add(5);
                return l;
            }
        }

        int distinct = aggregator.distinct(new Stub());

        assertEquals(4, distinct);
    }

    @Test
    public void distinct1() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        ListAggregator aggregator = new ListAggregator(list);

        class Stub implements IListDeduplicator {
            public List<Integer> deduplicate(IListSorter s) {
                List<Integer> l = new ArrayList<>();
                l.add(1);
                l.add(2);
                l.add(4);
                return l;
            }
        }

        int distinct = aggregator.distinct(new Stub());

        assertEquals(3, distinct);
    }
}