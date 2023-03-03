import java.util.*;
class StringReverse
{

    /* Function to print reverse of the passed string */

    void reverse(String str)

    {

        if ((str==null)||(str.length() <= 1))

           System.out.println(str);

        else

        {

            System.out.print(str.charAt(str.length()-1));

            reverse(str.substring(0,str.length()-1));

        }

    }

     

    /* Driver program to test above function */

    public static void main(String[] args) 

    {
        Scanner read = new Scanner(System.in);

        String str = read.next();

        StringReverse obj = new StringReverse();

        obj.reverse(str);

    }    
}
