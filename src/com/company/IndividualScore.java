package com.company;

import java.util.Scanner;

public class IndividualScore extends Projects
{
    Projects obj = new Projects();
    Scanner input = new Scanner(System.in);
    public int TotalScore;
    public int Pillar1;
    public int Pillar2;
    public int Pillar3;
    public int Pillar4;

    IndividualScore()
    {
        setPillar1();
        setPillar2();
        setPillar3();
        setPillar4();
        //IndiScore();
    }


    public void setPillar1()
    {
        System.out.println("Enter 6 scores based on Effort, On Time Delivery and Meeting Deliverables\n");
        int one=input.nextInt();
        int two=input.nextInt();
        int three=input.nextInt();
        int four=input.nextInt();
        int five=input.nextInt();
        int six=input.nextInt();

        int sum=one+two+three+five+four;
        Pillar1=sum;

    }

    public void setPillar2()
    {
        System.out.println("Enter score based on Quality of Deliverables\n");
        int in=input.nextInt();
        Pillar2=in;
    }

    public void setPillar3()
    {
        System.out.println("Enter score based on Problem Solving\n");
        int in=input.nextInt();
        Pillar3=in;
    }

    public void setPillar4()
    {
        System.out.println("Enter score based on Ways of Working\n");
        int in=input.nextInt();
        Pillar4=in;
    }

    public void setTotalScore()
    {
        TotalScore=Pillar1+Pillar2+Pillar3+Pillar4;
    }

    //public void IndiScore()
    {
       // obj.Indv_Scr=TotalScore;
    }








}
