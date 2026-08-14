class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>mp=new HashMap<>();
        Map<Character,Integer>mp1=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
            mp1.put(d,mp1.getOrDefault(d,0)+1);
        }
        return mp.equals(mp1);
    }
}
