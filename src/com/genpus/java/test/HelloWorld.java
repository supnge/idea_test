package com.genpus.java.test;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This is HelloWorld");
        print("1123");
    }
    public static void print(String string)
    {
        Character[] characters = new Character[26];
        for(Character c ='A', i=0 ; c<= 'Z';i++, c++)
        {
            characters[i] = c;
        }
        System.out.println(characters[0]+ "  "+ characters[25]);

        for(Character c: characters)
        {
            System.out.print(c+ "  ");
        }
    }
}
