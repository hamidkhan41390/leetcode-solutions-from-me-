class Solution {
    public int mostFrequentEven(int[] nums) {
          HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        if (map.isEmpty()) {
            return -1;
        }

        int max = 0;
        int answer = Integer.MAX_VALUE;

        for (int i : map.keySet()) {

            if (map.get(i) > max) {
                max = map.get(i);
                answer = i;
            }
            else if (map.get(i) == max && i < answer) {
                answer = i;
            }
        }

        return answer;
    //     ArrayList<Integer> l=new ArrayList<>();
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i:nums) {
    //         if (i % 2 == 0) {
    //             map.put(i, map.getOrDefault(i, 0) + 1);
    //         }
           
    //     }

    //     for (int i : map.keySet()) {
    //         if (map.get(i) %2==0) {
    //             l.add(i);

    //         }
    //     }
    //     int second=Integer.MAX_VALUE;
    //     for (int c:l){
    //         if(c<second){
    //             second=c;
    //         }
            
    //     }
    // return second;

    }
}