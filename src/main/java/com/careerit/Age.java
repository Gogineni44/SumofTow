package com.careerit;
import java.util.Scanner;


public class Age {
    public static void main(String[] args)
    {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of a person");
        int Age = sc.nextInt();

        if (Age > 60)

    {
        Age = Age;
        System.out.println("Senior Citizen");
    }
        else {
            if ( Age != 50)
            {
                System.out.println("Middle aged group people");
            }
            System.out.println("Kids");
        }

    }
    }


