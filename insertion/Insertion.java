public class Insertion {
    public static void main(String[] args) {
        int comparacoes = 0;
        int trocas = 0;
        int aux = 0;
        int[] numbers = {15,76,78,28,47,71,69,37,81,10,66,91,32,64,34,41,54,51,50,18,3,29,5,2,17,59,82,77,62,100,74,57,11,7,21,70,80,68,35};
        
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