import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,a,b,c,d,e,f,g;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi= inp.nextInt();
        a=sayi%10;
        b=sayi%100;
        b=b/10;
        c=sayi%1000;
        c=c/100;
        d=sayi%10000;
        d=d/1000;
        e=sayi%100000;
        e=e/10000;
        f=sayi%1000000;
        f=f/100000;
        g=sayi%10000000;
        g=g/1000000;
        int sonuc=a+b+c+d+e+f+g;
        System.out.println("Girdiğiniz sayının basamak sayıları toplamı: "+sonuc);







    }
}