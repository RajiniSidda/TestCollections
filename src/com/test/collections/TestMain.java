package com.test.collections;

/**
 * Created by bhara on 7/23/2018.
 */
public class TestMain {

    public static void main(String[] args) {

        System.out.println("Hello World");

        String Str="madam i' m adam";

        String Str2 = Str.replaceAll("[\\-\\+\\.\\^:,']\\s","");
        System.out.println(Str2);

        String Str3=Str2.replaceAll("\\s","");

        System.out.println(Str3);

        char ch[]=Str3.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=ch[ch.length-1-i])
            {
                System.out.println("not a palindrome");

                System.exit(0);
            }
        }

        System.out.println("palindrome");
        System.out.println("done");

    }
}
