public class Insertion {
    public static void main(String[] args) {
        int comparacoes = 0;
        int trocas = 0;
        int aux = 0;
        int[] numbers = {3,1,4,2,6,8,5};
        
        for (int k = 1; k < numbers.length; k++) {
            for (int i = k; i > 0; i--) {
                comparacoes++;
                if (numbers[i] < numbers[i-1]) {
                    aux = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = aux;
                    trocas++;
                }    
            }
        }
    }
}