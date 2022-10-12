import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner intscanner = new Scanner(System.in);
        int sayi,sum=0;
        System.out.print("Sayı giriniz: ");
        sayi = intscanner.nextInt();
        for(int i = 2;i<=sayi;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){sum++;}

            }
            if(sum==0){
            System.out.print(i+" ");}
            sum=0;
        }
    }
}
