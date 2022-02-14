package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int sayi,i;
        Scanner input=new Scanner(System.in);
        System.out.println("sayiyi girin");
        sayi=input.nextInt();
        for( i =1;i<sayi;i++)
            //System.out.println(i);
        if(i%20==0){
            System.out.println("20 ye bolunenler"+i);
        }


    }


    }




