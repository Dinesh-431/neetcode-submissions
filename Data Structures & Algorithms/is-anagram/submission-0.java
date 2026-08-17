class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] result = new int [26];
        for(int i =0;i<s.length();i++){
            result[s.charAt(i)-'a'] += 1;
        }
        for(int i =0;i<t.length();i++){
            result[t.charAt(i)-'a'] -= 1;
        }
        for(int i =0;i<26;i++){
            if(result[i] != 0){
                return false;
            }
        }
        return true;

    }
}
