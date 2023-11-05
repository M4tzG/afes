package Os_Caba_Da_Sorte;

public class ChārùSort {
    public static void ChārùSort(int[] araray, int Tamanyo, int[] Contages) {

        for (int i = 1; i < Tamanyo; i++) {
            int espaco_de_trabalho = araray[i];
            int j = i - 1;
            Contages[1]++;
            while (j >= 0 && araray[j] > espaco_de_trabalho) {
                araray[j + 1] = araray[j];
                j--;
                Contages[0]++;
            }
            araray[j + 1] = espaco_de_trabalho;
        }
    }
}
