//. Write a program to reverse the characters of a string.
public class Ass6Prob2 {
    public static void main(String[] args) {
        String str="anything";
        str=reverse(str);
        System.out.print(str);
    }
    static String reverse(String str)
    {
        if(str.length()<=1)
            return str.substring(str.length()-1);
        return reverse(str.substring(1,str.length()))+str.charAt(0);
    }
}
