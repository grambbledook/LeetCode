package com.github.grambbledook.java.task349;

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;

    public class Solution {

        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> index = new HashSet<>(nums1.length);
            for (int i = 0; i < nums1.length; i++) {
                index.add(nums1[i]);
            }

            List<Integer> intersection = new ArrayList<>(nums2.length);
            for (int i = 0; i < nums2.length; i++) {
                if (index.contains(nums2[i])) {
                    index.remove(nums2[i]);
                    intersection.add(nums2[i]);
                }
            }

            return toArray(intersection);
        }

        private int[] toArray(List<Integer> list) {
            int[] result = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        }

    }
