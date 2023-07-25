package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;


public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        sourceMap.forEach((key, value) -> {
            var valueSet = result.get(key.length());
            if(valueSet != null) {
                valueSet.add(key);
            }else {
                result.put(key.length(), new TreeSet<>(List.of(key)));
            }
        });
        return result;
    }
}
