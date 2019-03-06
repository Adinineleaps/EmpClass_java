package com.company;

import java.util.Scanner;

public class Code  {
    public Character code;
    public int PP;
    public int VB;
    public int Oth;

    Scanner input = new Scanner(System.in);

    public void getCODE(){
        code=input.next().charAt(0);
    }

    public void setCODE(){
        if(code=='A'){
            PP=80;
            VB=20;
            Oth=0;
        }
        else if(code=='B'){
            PP=60;
            VB=20;
            Oth=20;
        }
        else{
            PP=40;
            VB=30;
            Oth=30;
        }

    }
}

