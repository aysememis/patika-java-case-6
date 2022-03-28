import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class ManavKasaProgrami {

    public static void main(String[] args) {
        int kilo ;
        double armutFiyat = 2.14 ;
        double elmaFiyat = 3.67 ;
        double domatesFiyat = 1.11 ;
        double muzFiyat = 0.95 ;
        double patlicanFiyat = 5.00 ;

        Scanner inp = new Scanner(System.in) ;

        System.out.print("Armut kaç kilo? :");
        kilo = inp.nextInt();

        System.out.print("Elma kaç kilo? :");
        kilo = inp.nextInt() ;

        System.out.print("Domates kaç kilo? :");
        kilo = inp.nextInt();

        System.out.print("Muz kaç kilo? :");
        kilo = inp.nextInt() ;

        System.out.print("Patlıcan kaç kilo? :");
        kilo = inp.nextInt();


        double armutTutar = armutFiyat*kilo ;
        double elmaTutar = elmaFiyat*kilo ;
        double domatesTutar = domatesFiyat*kilo ;
        double muzTutar = muzFiyat*kilo ;
        double patlicanTutar = patlicanFiyat*kilo ;

        double toplamTutar = armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar ;

        System.out.println("Toplam tutar? :"+toplamTutar);
    }
}
