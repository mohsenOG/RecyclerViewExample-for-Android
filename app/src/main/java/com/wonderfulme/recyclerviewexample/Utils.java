package com.wonderfulme.recyclerviewexample;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    private Utils() { }

    static public List<Integer> getRecyclerViewValue() {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < 100; ++i) {
            ret.add(i);
        }
        return ret;
    }
}

