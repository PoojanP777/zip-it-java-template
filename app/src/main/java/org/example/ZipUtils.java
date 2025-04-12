package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZipUtils {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int minSize = Math.min(size1, size2);

        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        if (size1 > size2) {
            result.addAll(list1.subList(minSize, size1));
        } else if (size2 > size1) {
            result.addAll(list2.subList(minSize, size2));
        }

        return result;
    }
}
