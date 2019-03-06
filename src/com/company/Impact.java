package com.company;

import java.util.Scanner;

public class Impact extends Main {
        public int i;
        public int m;
        public int p;
        public int a;
        public int c;
        public int t;
        double score;

        Impact()
        {
            getValue();
            Score();
        }
    public void getValue(){
        System.out.println("Enter score for IMPACT values:\n");
        Scanner input = new Scanner(System.in);
         i =input.nextInt();
         m =input.nextInt();
         p =input.nextInt();
         a =input.nextInt();
         c =input.nextInt();
         t =input.nextInt();
    }

    public void Score(){
        double sum=i+m+p+a+c+t;
        score= sum/60*100;
    }









}
