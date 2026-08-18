class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char [] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(strs[i]);
                map.put(key,list);
            }else{
                List<String> list= new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> list : map.values()) {
    result.add(list);
}
        return result;
        
    }
}
