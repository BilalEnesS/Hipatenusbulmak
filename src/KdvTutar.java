import java.util.Scanner;
public class KdvTutar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdvtutar, toplamtutar, kdvoran = 0.18;
        System.out.print("Harcadığınız tutarı giriniz: ");
        tutar = input.nextInt();
        kdvtutar = tutar*kdvoran;
        toplamtutar = kdvtutar + tutar;
        System.out.print("KDV miktarı: ");
        System.out.println(kdvtutar);
        System.out.print("Toplam tutar: ");
        System.out.print(toplamtutar);





    }
}
