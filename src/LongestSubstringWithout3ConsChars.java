public class LongestSubstringWithout3ConsChars {

    public static void main(String[] args) {

        String res=new LongestSubstringWithout3ConsChars().longestSubstring("aabbaabaabbbcdefghijklmnopqrstuvwxyz");

    }

    public String longestSubstring(String str)
    {

        char[] ch=str.toCharArray();

        int l=0;
        int r=0;
        int cnt=1;
        int maxLen=Integer.MIN_VALUE;

        while(r<ch.length-1)
        {

            if(ch[r]==ch[r+1])
            {

                cnt++;

                if(cnt>2)
                {
                    if(r-l+1>maxLen)
                    {
                        maxLen=r-l+1;
                        System.out.println(str.substring(l,r+1));
                    }

                    l=r+1;
                    cnt=1;

                }
            }
            else
            {
                cnt=1;


            }

            r++;


        }

        System.out.println(str.substring(l,r+1));






        return "";
    }
}
