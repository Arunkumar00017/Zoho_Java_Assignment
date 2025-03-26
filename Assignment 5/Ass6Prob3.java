public class Ass6Prob3 {
    public static void main(String[] args) {
        String str="one two three";
        str=reverseWord(str);
        System.out.print(str);
    }
    static String reverseWord(String str)
    {
        if(str.indexOf(" ")==-1)
            return str;
        return reverseWord(str.substring(str.indexOf(" ")+1))+" "+str.substring(0,str.indexOf(" "));
    }


}
