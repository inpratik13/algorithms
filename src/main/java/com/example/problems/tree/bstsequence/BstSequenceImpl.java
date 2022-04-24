/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.tree.bstsequence;

import com.example.problems.tree.Node;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

public class BstSequenceImpl implements BstSequence {

    @Override
    public List<List<Integer>> generate(Node<Integer> node) {
        if (node == null)
            return emptyList();

        List<List<Integer>> generatedLeft = generate(node.getLeft());
        List<List<Integer>> generatedRight = generate(node.getRight());

        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> leftElem : generatedLeft) {
            for (List<Integer> rightElem : generatedRight) {
                result.addAll(merge(node.getValue(), leftElem, rightElem));
            }
        }

        return result;
    }

    private List<? extends List<Integer>> merge(Integer value, List<Integer> leftElem, List<Integer> rightElem) {
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }

    private List<? extends List<Integer>> merge(List<Integer> result, List<Integer> prefix, List<Integer> leftElem,
            List<Integer> rightElem) {

        return null;
    }

}
