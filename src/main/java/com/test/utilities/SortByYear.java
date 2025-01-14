package com.test.utilities;
import com.test.components.AutoMobile;

import java.util.Comparator;

public class SortByYear implements Comparator {
    public int compare(Object o1, Object o2) {
        AutoMobile a = (AutoMobile) o1;
        AutoMobile b = (AutoMobile) o2;
        return Integer.compare(a.year, b.year);

    }
}
