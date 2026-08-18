class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int num : nums){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        TreeMap<Integer,List<Integer>> map = new TreeMap<>(Collections.reverseOrder());
        for(int num : frequency.keySet()){
            int freq = frequency.get(num);
            map.computeIfAbsent(freq,f-> new ArrayList<>()).add(num);
        }
        int [] result = new int[k];
        int index =0;
        int remaining = k;
        for(List<Integer> list : map.values()){
            if(list.size() >= remaining){
                for(int i=0;i<remaining;i++){
                    result[index] = list.get(i);
                    index++;
                }
                break;
            }else{
                for(int i=0;i<list.size();i++){
                    result[index] = list.get(i);
                    index++;
                }
                remaining -= list.size();
            }
        }
        return result;
        
    }
}
