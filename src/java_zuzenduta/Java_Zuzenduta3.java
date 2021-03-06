package java_zuzenduta;

public class Java_Zuzenduta3 {
    public static void main(String[] args) {
        int array[] = new int[9990];
        int indizea = 0;
        for (int i : array) {
            int zenbakia = i + 10;
            String aux = zenbakia + "";
            Boolean flag = true;
            for (int j = 0; j < aux.length() && flag; j++) {
                for (int k = j + 1; k < aux.length() && flag; k++) {
                    if (aux.charAt(j) == aux.charAt(k)) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                array[indizea] = zenbakia;
                indizea++;
            }
        }
        for (int i = 0; i < indizea; i++) {
            System.out.println(array[i]);
        }
    }
}
