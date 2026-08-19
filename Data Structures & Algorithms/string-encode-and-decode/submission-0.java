class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s.length());
            str.append("#");
            str.append(s);
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int len = 0;
        int i= 0;
        while(i < str.length()){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' ){
                len = (len*10 + str.charAt(i) - '0');
                i++;
            }
            else if(str.charAt(i)=='#'){
                i++;
                strs.add(str.substring(i,i+len));
                
                i += len;
                len = 0;
            }else{
                i++;
            }
        }
        return strs;

    }
}
