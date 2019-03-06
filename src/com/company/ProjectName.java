package com.company;

import java.util.Scanner;

public class ProjectName extends Projects
{

        public String PName;
        public String Name="Astro";

        Projects obj = new Projects();

        Scanner input = new Scanner(System.in);
       ProjectName()
       {

        getName();
        ValName();
        setName();
    }


        public void getName ()
        {
            System.out.println("Enter the project name:\n");
            PName = input.nextLine();
        }

        public void ValName ()
        {
            if (PName.equals(Name))
            {
                obj.prj_Scr = 82;
            }
            else if (PName.equals("Darwin"))
            {
                obj.prj_Scr = 76;
            }
            else if
            (PName.equals("Elixir"))
            {
                obj.prj_Scr = 85;
            }
            else if (PName.equals("Indigo"))
            {
                obj.prj_Scr = 70;
            }
            else if (PName.equals("Moonshot"))
            {
                obj.prj_Scr = 90;
            }
            else if (PName.equals("Phoenix"))
            {
                obj.prj_Scr = 87;
            }
            else if (PName.equals("Uno"))
            {
                obj.prj_Scr = 80;
            }
        }

        public void setName ()
        {
            obj.name = PName;
        }





}