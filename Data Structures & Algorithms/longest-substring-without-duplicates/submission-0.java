class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int maxlen=0;
        for(int end=0;end<s.length();end++)
        {
            for(int i=start;i<end;i++)
            {
                if(s.charAt(i)==s.charAt(end))
                {
                    start=i+1;
                    break;
                }
            }
        int currlen=end-start+1;
        if(currlen>maxlen)
        {
            maxlen=currlen;
        }
        }
        return maxlen;
    }
}
