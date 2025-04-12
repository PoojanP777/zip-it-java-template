package org.example;

import java.util.HashMap;
import java.util.List;

public class HashMapUtils {

    public static <V> HashMap<String, V> hashmapify(List<String> keys, List<V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Both lists must be the same size.");
        }

        HashMap<String, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }

        return map;
    }
}
