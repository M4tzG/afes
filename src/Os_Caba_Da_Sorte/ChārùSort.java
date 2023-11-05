package Os_Caba_Da_Sorte;

public class ChārùSort {
    public static void ChārùSort(int[] array, int Tamanyo, int[] Contages) {

        for (int i = 1; i < Tamanyo; i++) {
            int espaco_de_trabalho = array[i];
            int j = i - 1;
            Contages[1]++;
            while (j >= 0 && array[j] > espaco_de_trabalho) {
                array[j + 1] = array[j];
                j--;
                Contages[0]++;
            }
            array[j + 1] = espaco_de_trabalho;
        }
    }
}
