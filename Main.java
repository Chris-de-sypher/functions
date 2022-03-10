/*CHRISTIAN OSUJI
MATRIC NUMBER : T1002021006
LVL : 200
 */



package com.codewithchris;

public class Main {

    public static void main(String[] args) {
	int i = 0;
    while(i < 9){
        System.out.println(i);i++;
    }
    // do while loop
        int result = 9;
        int p = 0;
       // int i=1;
        do{
            System.out.println(result);
            p++;
            result++;
        }while(p<0 || p>5);

        //switch
        int colors = 20;
        switch(colors){
            case 5:
                System.out.println("5");
                break;
            case 8:
                System.out.println("8");
                break;
            case 40:
                System.out.println("40");
                break;
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 18:
                System.out.println("18");
                break;
            case 45:
                System.out.println("45");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("print none");
        }


    }
}



