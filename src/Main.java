import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner tara=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz :");
        int sayi1=tara.nextInt();
        System.out.println("İkinci sayiyi giriniz : ");
        int sayi2=tara.nextInt();
        int toplam1=0;
        int toplam2=0;




            if(sayi1<=1 && sayi2<=1 ) {
                System.out.println("Eksik sayi girdiniz!!!");

            }




        for(int i=1;i<sayi1;i++)
        {
            if(sayi1%i==0)
            {
                      toplam1=toplam1+i;
            }
        }
        for (int i=1;i<sayi2;i++)
        {
                      toplam2=toplam2+i;

        }
        if(sayi1==toplam2 && sayi2==toplam1)
        {
            System.out.println("Bu iki sayi arkadaştır.");

        }
        else {

            System.out.println( "Bu iki sayi arkadaş degildir.");
        }



    }


    }

