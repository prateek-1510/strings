public class MinSwapsForPalindrome {

    public static void main(String[] args) {

        int res=new MinSwapsForPalindrome().minSwaps("mamad");

        System.out.println(res);

    }

    public int minSwaps(String str)
    {
        int len=str.length();
        int l=0;
        int r=len-1;
        char[] ch=str.toCharArray();
        int swapCnt=0;

        while(l<r)
        {
            if(ch[l]==ch[r])
            {
                l++;
                r--;

            }
            else
            {
                int k=r;
                while(ch[l]!=ch[k])
                {
                    k--;
                }
                if(k==l)
                {
                    return -1;
                }
                else
                {
                    swapCnt=swap(ch,k,r,swapCnt);
                }

                l++;
                r--;

            }

        }

        return swapCnt;
    }

    private int swap(char[] ch, int k, int r, int swapCnt) {

        for(int i=k;i<r;i++)
        {
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            swapCnt++;

        }

        return swapCnt;

    }
}
