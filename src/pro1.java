import java.util.Scanner;
//Problem Statement
//Given an integer K, find a positive integer x such that K = x2 + 3*x. If no such positive integer x exists, print -1.
//Print a positive integer x such that the above equation satisfies. If no such integer x exists, print -1.
//Example
//Sample Input:
//28
//
//Sample Output:
//4
public class pro1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        System.out.println("K is --"+" "+ k);
        Scanner sn=new Scanner(System.in);
        int x=sn.nextInt();
        System.out.println("x is --"+ " "+ x);
        if(k== x*x + 3*x){
            System.out.println("ans"+" "+x);
        }else {
            System.out.println(-1);
        }
    }
}
