package com.company;

import java.util.Scanner;

public class Projects extends Main {


        public String name;
        public int Indv_Scr;
        public int Dur_wrk;
        public int prj_Scr;
        public int tot_Scr;

        Scanner input = new Scanner(System.in);




        public void show()
        {
                System.out.println(prj_Scr);
//                System.out.println(prj_Scr);
        }
        public void Duration()
        {
                System.out.println("Enter the duration worked on the project\n");
                Dur_wrk = input.nextInt();
        }

        public void TotalScore()
        {
                tot_Scr=Indv_Scr+prj_Scr;
        }








}
