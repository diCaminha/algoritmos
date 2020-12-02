public class Insertion {
    public static void main(String[] args) {
        int comparacoes = 0;
        int trocas = 0;
        int aux = 0;
        int[] numbers = {50,49,48,47,46,45,44,43,42,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        var insertion = new Insertion();

        long startTime = System.nanoTime();
        insertion.sort(numbers);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime);
    }

    public void sort(int[] numbers) {
        int aux = 0;
        for (int k = 1; k < numbers.length; k++) {
            for (int i = k; i > 0; i--) {
                if (numbers[i] < numbers[i-1]) {
                    aux = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = aux;
                }    
            }
        }
    }
}