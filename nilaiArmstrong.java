
package javaapplication1;
import java.util.Scanner;
public class nilaiArmstrong {
    public static void main(String[] args) {
        int d1,d2,d3,d4;
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai=sc.nextInt();
        d4=nilai%10;
        d3=(nilai%100)/10;
        d2=(nilai%1000)/100;
        d1=nilai/1000;
        int total=(d1*d1*d1*d1)+(d2*d2*d2*d2)+(d3*d3*d3*d3)+(d4*d4*d4*d4);
        if(total==nilai){
            System.out.println("Nilai merupakan bilangan armstrong");
        }else{
            System.out.println("Nilai bukan merupakan bilangan armstrong");
        }
    }
}
