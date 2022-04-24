///**
// * (C) VyanTech.com Ltd 2021
// */
//package com.example.algorithm.dp.setcover;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.IntStream;
//
//import static java.util.stream.Collectors.toSet;
//
//public class SetCoverImpl implements SetCover {
//
//    @Override
//    public ElementSet[] chooseSets(ElementSet[] elements, int[] universe) {
//
//        Set<ElementSet> sets = new HashSet<>(Arrays.asList(elements));
//        Set<Integer> u = IntStream.of(universe)
//                .boxed()
//                .collect(toSet());
//        Set<Integer> collected = new HashSet<>();
//
//        while (!collected.equals(u) || sets.isEmpty()) {
//
//        }
//
//        return elements;
//    }
//
//    private static class ElementSetComparator implements Comparator<ElementSet> {
//
//        private final Set<Integer> collected;
//
//        public ElementSetComparator(Set<Integer> collected) {
//            this.collected = collected;
//        }
//
//        @Override
//        public int compare(ElementSet a, ElementSet b) {
//            
//        }
//        
//        private int costPerElem(ElementSet set) {
//            
//        }
//
//    }
//
//}
