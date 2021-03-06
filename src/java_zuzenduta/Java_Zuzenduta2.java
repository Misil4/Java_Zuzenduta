package java_zuzenduta;

// 10 eta 6 elementu dituen bi taula sortu (datuak teklatuz sartuaz). Ziurtatu behar dugu bigarren taulako zenbakiak 1eta 10 bitartekoak direla. Lehengo taulako elementu bakoitza, bigarren taulako elementu guztiekin zatitu eta hondarrak gorde behar ditugu hurrengo mezua ateraz:
// x zati y –ren hondarra z da.
// Gainera,  0tik 9 artean, zenbat hondar dauden zenbatu behar ditugu, adibidez:
// 0 zenbakiko 4 hondar daude
// 1 zenbakiko 5 hondar daude…
import java.util.Scanner;
 
public class Java_Zuzenduta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int erantzuna, one = 0, zero = 0;
        int bat[] = new int[10];
        int bi[] = new int[6];
        for (int i = 0; i < bat.length; i++) {
            System.out.println("Sartu lehengo taulako zenbaki bat");
            bat[i] = sc.nextInt();
        }
        for (int i = 0; i < bi.length; i++) {
            System.out.println("Sartu bigarren tailako zenbaki bat");
            bi[i] = sc.nextInt();
            if (bi[i] < 0) {
                System.out.println("Sartutako zenbakia negatiboa da");
            }
        }
        for (int i : bat) {
            for (int j : bi) {
                erantzuna = i / j;
                if (erantzuna == 1) {
                    one++;
                }
                if (erantzuna == 0) {
                    zero++;
                }
            }
        }
        System.out.println("0 zenbakiko " + zero + " hondar daude\n" + "1 zenbakiko " + one + " hondar daude");
    }
}
