class Solution {
    public int subarraySum(int[] nums, int k) {
        /*int count = 0;  BruteForce
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;*/
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int sum = 0;
        int count = 0;

        for (int i : nums) {
            sum += i;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
