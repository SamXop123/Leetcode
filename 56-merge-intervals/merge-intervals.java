class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(intervals[0][0]);
        first.add(intervals[0][1]);
        result.add(first);

        for (int i = 1; i < intervals.length; i++) {
            int a1 = result.get(result.size()-1).get(0); 
            int b1 = result.get(result.size()-1).get(1);
            int a2 = intervals[i][0];
            int b2 = intervals[i][1];

            if (a2 <= b1) {
                result.get(result.size()-1).set(1, Math.max(b1, b2));
            } else {
                List<Integer> newInterval = new ArrayList<>();
                newInterval.add(a2);
                newInterval.add(b2);
                result.add(newInterval);
            }
        }

        int[][] merged = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            merged[i][0] = result.get(i).get(0);
            merged[i][1] = result.get(i).get(1);
        }

        return merged;
    }
}
