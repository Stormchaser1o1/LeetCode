class Solution {
    public int minSteps(String s, String t) {
        int[] count=new int[26];
        for(int i=0;i<t.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        int ans=0;
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
                ans+=count[i];
        }
        return ans;
        
    }
}