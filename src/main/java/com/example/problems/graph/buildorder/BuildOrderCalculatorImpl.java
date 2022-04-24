/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.graph.buildorder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BuildOrderCalculatorImpl implements BuildOrderCalculator {

    @Override
    public char[] calculate(char[][] dependencies) {
        Map<Character, List<Character>> nodes = new HashMap<>();
        for (char[] edge : dependencies) {
            nodes.compute(edge[0], (k, v) -> {
                return v == null ? asList(edge[1]) : addToList(edge[1], v);
            });
            nodes.putIfAbsent(edge[1], new ArrayList<>());
        }

        char[] output = new char[nodes.size()];
        int outputIndex = 0;

        while (nodes.size() != 0) {
            List<Character> noDepNodes = nodes.entrySet()
                    .stream()
                    .filter(e -> e.getValue().isEmpty())
                    .map(Entry::getKey)
                    .collect(Collectors.toList());

            if (noDepNodes.size() == 0) {
                throw new IllegalStateException("");
            }

            for (Character noDep : noDepNodes) {
                nodes.remove(noDep);
                nodes.values().forEach(list -> list.remove(noDep));
                output[outputIndex++] = noDep;
            }

        }

        return output;
    }

    private List<Character> asList(Character c) {
        List<Character> list = new ArrayList<>();
        list.add(c);
        return list;
    }

    private List<Character> addToList(Character c, List<Character> v) {
        v.add(c);
        return v;
    }

}
