import java.util.Scanner;
public class Java_Zuzenduta2 {
    
// 10 eta 6 elementu dituen bi taula sortu (datuak teklatuz sartuaz). Ziurtatu behar dugu bigarren taulako zenbakiak 1eta 10 bitartekoak direla. Lehengo taulako elementu bakoitza, bigarren taulako elementu guztiekin zatitu eta hondarrak gorde behar ditugu hurrengo mezua ateraz:
// x zati y –ren hondarra z da.
// Gainera,  0tik 9 artean, zenbat hondar dauden zenbatu behar ditugu, adibidez:
// 0 zenbakiko 4 hondar daude
// 1 zenbakiko 5 hondar daude…

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bat[] = new int[10];
        int bi[] = new int[6];
        for (int i = 0)
            System.out.println("Sartu lehengo taulako zenbaki bat");
            bat[i] = sc.nextInt();
        }
        for (int i : bi) {
            System.out.println("Sartu bigarren tailako zenbaki bat");
            bi[i] = sc.nextInt();
            if (bi[i] < 0) {
                System.out.println("Sartutako zenbakia negatiboa da");
            }
        }
        for (int i:bat) {
            for (int j:bi) {
                System.out.println("Lehengo taula:\t "+bat[i]+" \nBigarren taula:\t "+bi[j]);
            }
        }
    }
}

