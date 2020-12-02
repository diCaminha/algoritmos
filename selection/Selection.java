public class Selection {
    int comparacoes = 0;
    int trocas = 0;

    public static void main(String... args) {
        int[] numbers = {50,49,48,47,46,45,44,43,42,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        var selection = new Selection();
        selection.sort(numbers);
    }

    public void sort(int[] numbers) {
        long startTime = System.nanoTime();
        int aux = 0;
        for (int k = 0; k < numbers.length; k++) {
            var posMenor = k;
            for (int i = k; i < numbers.length; i++) { 
                this.comparacoes++;
                if (numbers[i] < numbers[posMenor]) {
                    posMenor = i;
                }
            }
            if (posMenor != k) {
                aux = numbers[k];
                numbers[k] = numbers[posMenor];
                numbers[posMenor] = aux;
                this.trocas++;
            }
        }
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("tempo: " + elapsedTime);
        System.out.println("comparacoes: " + this.comparacoes);
        System.out.println("trocas: " + this.trocas);
    }
    

}