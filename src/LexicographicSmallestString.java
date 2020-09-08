import java.util.Stack;

public class LexicographicSmallestString {

    public static void main(String[] args) {

        String res=new LexicographicSmallestString().removeKdigits("123224",3);

        System.out.println(res);

    }

    public String removeKdigits(String num, int k) {

        Stack<Character> st=new Stack<>();

        char[] ch=num.toCharArray();
        int cnt=0;


        for(char c: ch)
        {
            while(!st.isEmpty() && st.peek()>c && cnt<k)
            {
                st.pop();
                cnt++;
            }

            st.push(c);

        }

        while(cnt<k && !st.isEmpty())
        {
            st.pop();
            cnt++;

        }

        boolean leadingZero=true;
        String res="";

        while(!st.isEmpty())
        {


            res=st.pop()+res;

        }

        String str="";
        boolean preceedingZero=true;

        for(char chh:res.toCharArray())
        {
            if(preceedingZero && chh=='0')
            {
                continue;
            }

            preceedingZero=false;

            str+=chh;


        }

        if(str.length()==0) return "0";

        return str;







    }
}
