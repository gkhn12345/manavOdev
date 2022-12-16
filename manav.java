import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        // değerleri giriyoruz
        double kilo ,toplamUcret,armutkgfiyat=2.14 , elmakgfiyat=3.67,domateskgfiyat=1.11,muzkgfiyat=0.95,patlicankgfiyat=5;

        Scanner input= new Scanner(System.in);

        //kullanıcıdan verileri alıyoruz.

        System.out.print("KAÇ KİLO ARMUT ALDINIZ :");
        kilo= input.nextDouble();
        System.out.print("KAÇ KİLO ELMA ALDINIZ :");
        kilo=input.nextDouble();
        System.out.print("KAÇ KİLO DOMATES ALDINIZ :");
        kilo= input.nextDouble();
        System.out.print("KAÇ KİLO MUZ ALDINIZ :");
        kilo= input.nextDouble();
        System.out.print("KAÇ KİLO PATLICAN ALDINIZ :");
        kilo= input.nextDouble();

        toplamUcret = armutkgfiyat*kilo + elmakgfiyat*kilo + domateskgfiyat*kilo + muzkgfiyat*kilo+patlicankgfiyat*kilo;
        System.out.println("TOPLAM ÜCRET : " +toplamUcret);











    }
}
