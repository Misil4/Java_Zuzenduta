package java_zuzenduta;
import java.util.Scanner;
public class Java_Zuzenduta4 {
    static int Potentzia(int n1, int n2) {
        int potentzia = 1;
        for (int i = 1; i <= n2; i++) {
            potentzia =potentzia * n1;
        }
        return potentzia;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oinarri, berretzaile;
        System.out.println("Sartu oinarria");
        oinarri = sc.nextInt();
        System.out.println("Sartu berretzailea");
        berretzaile = sc.nextInt();
        System.out.println(Potentzia(oinarri, berretzaile));
    }
}

