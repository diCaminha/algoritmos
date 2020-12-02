public class Selection {
    public static void main(String... args) {
        int comparacoes = 0;
        int trocas = 0;
        int aux = 0;
        int[] numbers = {50,49,48,47,46,45,44,43,42,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        var selection = new Selection();

        long startTime = System.nanoTime();
        selection.sort(numbers);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime);
        System.out.println(numbers[0] + "," + numbers[1] + "," + numbers[2] + "," + numbers[3]);
    }

    public void sort(int[] numbers) {
        int aux = 0;
        for (int k = 0; k < numbers.length; k++) {
            var posMenor = k;
            for (int i = k; i < numbers.length; i++) {
                if (numbers[i] < numbers[posMenor]) {
                    posMenor = i;
                }
            }
            aux = numbers[k];
            numbers[k] = numbers[posMenor];
             numbers[posMenor] = aux;
        }
    }
    

}