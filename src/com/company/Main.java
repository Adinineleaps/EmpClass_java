package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    	Character code;
		int PP;
		int VB;
		int Oth;

		System.out.println("Enter the Weightage code:\n");

		Scanner input = new Scanner(System.in);

		code=input.next().charAt(0);

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

		/*System.out.println("Enter number of projects:\n");
		int projects = input.nextInt();*/

		Impact obj = new Impact();
		double score_1=obj.score;
		System.out.println(score_1*VB/100);

		Projects obj2 = new Projects();
		ProjectName obj4 = new ProjectName();
		//IndividualScore obj3 = new IndividualScore();
		obj2.show();
		//obj2.Duration();
		//obj2.TotalScore();
		//obj2.show();










    }
}
