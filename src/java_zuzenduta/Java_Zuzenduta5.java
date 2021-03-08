package java_zuzenduta;

import java.util.Scanner;

//
public class Java_Zuzenduta5 {
    public static void main(String[] args) {

        String bocalak = "aeiou";
        String bocalak2 = "AEIOU";
        String frase = "";
        char vocal = '-';
        Scanner sc = new Scanner(System.in);
        while (frase != ".") {
            System.out.println("Introduce una frase");
            frase = sc.nextLine();
            System.out.println("Introduce una vocal");
            vocal = sc.nextLine().charAt(0);
            for (int pos = 0; pos < 5; pos++) {
                if (vocal != bocalak.charAt(pos)) {
                }
                    frase = frase.replace(bocalak.charAt(pos), vocal);
                    frase = frase.replace(bocalak2.charAt(pos), Character.toUpperCase(vocal));
                }
                System.out.println(frase);
            }
        }
    }