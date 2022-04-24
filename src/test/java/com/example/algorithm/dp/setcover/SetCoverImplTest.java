///**
// * (C) VyanTech.com Ltd 2021
// */
//package com.example.algorithm.dp.setcover;
//
//import com.example.algorithm.dp.setcover.SetCover.ElementSet;
//
//import java.util.Arrays;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class SetCoverImplTest {
//
//    public static final SetCover setCover = new SetCoverImpl();
//
//    @Test
//    public void test1() {
//        ElementSet[] sets = new ElementSet[] {
//                new ElementSet(new int[] { 4, 1, 5 }, 5),
//                new ElementSet(new int[] { 2, 5 }, 8),
//                new ElementSet(new int[] { 1, 4, 3, 2 }, 3)
//        };
//
//        int[] universe = { 1, 2, 3, 4, 5 };
//
//        ElementSet[] choosenSets = setCover.chooseSets(sets, universe);
//        int totalCost = Arrays.stream(choosenSets)
//                .mapToInt(ElementSet::getCost)
//                .sum();
//
//        assertEquals(8, totalCost);
//    }
//}
