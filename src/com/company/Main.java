package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int a = 4, b = 3;
        int counter = 0;
        int result = 1;
        while (counter < a)
        {
            result = result * b;
            counter = counter + 1;
        }
        System.out.println (result);
    }

}
