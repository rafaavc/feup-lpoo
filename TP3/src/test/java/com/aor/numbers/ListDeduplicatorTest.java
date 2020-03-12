package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListDeduplicatorTest {
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
    public void deduplicate() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        class Stub implements IListSorter {
            public List<Integer> sort() {
                List<Integer> l = new ArrayList<>();
                l.add(1);
                l.add(2);
                l.add(2);
                l.add(4);
                l.add(5);
                return l;
            }
        }
        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(new Stub());

        assertEquals(expected, distinct);
    }
}