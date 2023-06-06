package kh.lclass.io;

import java.util.Scanner;
public class maind{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int temp = 0;
    
        for(int i = 0; i < n; i++){
           a[i] = i + 1;
        } 
        for(int i = 0; i < m; i++) {
            int b = sc.nextInt(); 
            int c = sc.nextInt();
            temp = a[b];
            a[b] = a[c];
            a[c] = temp;
        }
        sc.close();
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
