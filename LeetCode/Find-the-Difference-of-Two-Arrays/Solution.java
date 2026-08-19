1import java.util.ArrayList;
2import java.util.Arrays;
3import java.util.HashSet;
4import java.util.List;
5import java.util.Set;
6
7class Solution {
8    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
9        Set<Integer> set1 = new HashSet<>();
10        Set<Integer> set2 = new HashSet<>();
11        
12        for (int num : nums1) {
13            set1.add(num);
14        }
15        for (int num : nums2) {
16            set2.add(num);
17        }
18        List<Integer> list1 = new ArrayList<>();
19        for (int num : set1) {
20            if (!set2.contains(num)) {
21                list1.add(num);
22            }
23        }
24        List<Integer> list2 = new ArrayList<>();
25        for (int num : set2) {
26            if (!set1.contains(num)) {
27                list2.add(num);
28            }
29        }
30        
31        return Arrays.asList(list1, list2);
32    }
33}