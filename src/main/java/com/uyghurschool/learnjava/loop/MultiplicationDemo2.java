package com.uyghurschool.learnjava.loop;

public class MultiplicationDemo2 {
    public static void main(String[] args) {
        for(int x=1;x<=9;x++)
        {
            for(int y=1;y<=x;y++)
            {
                int z=x*y;
                System.out.print(String.format("%d*%d=%d  ",x,y,z));
            }
            System.out.println();
        }
    }
}
