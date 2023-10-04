import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        String Abc = "ёйцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮqwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String txt = "Initializes a newly created String object so that it represents an empty character sequence. Note that use of this constructor is unnecessary since Strings are immutable.";
        String str = new String();
        int k = in.nextInt();
        int n = 0;
        for(int i=0; i<= txt.length()-1; i++)
        {
            if (Abc.contains(String.valueOf(txt.charAt(i))))
                n++;
            else
                n = 0;
            if(n != k)
                str += txt.charAt(i);
            else
                str += '+';
        }
        System.out.println(str);
    }
}

