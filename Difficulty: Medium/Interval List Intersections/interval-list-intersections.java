class Solution {
    public List<List<Integer>> findIntersection(List<List<Integer>> arr1,
                                                List<List<Integer>> arr2) {

        int i = 0;
        int j = 0;

        List<List<Integer>> res = new ArrayList<>();

        while (i < arr1.size() && j < arr2.size()) {

            int start1 = arr1.get(i).get(0);
            int end1 = arr1.get(i).get(1);

            int start2 = arr2.get(j).get(0);
            int end2 = arr2.get(j).get(1);

            if (start1 <= start2) {

                if (end1 >= start2) {

                    int start = Math.max(start1, start2);
                    int end = Math.min(end1, end2);

                    res.add(Arrays.asList(start, end));
                }
            }
            else {

                if (end2 >= start1) {

                    int start = Math.max(start1, start2);
                    int end = Math.min(end1, end2);

                    res.add(Arrays.asList(start, end));
                }
            }

            if (end1 <= end2) {
                i++;
            }
            else {
                j++;
            }
        }

        return res;
    }
}