package Os_Caba_Da_Sorte;

public class RipBoSort {

    public static void HeepySort(int araray[], int Tamanho, int[] Contages) {
        for (int i = Tamanho / 2 - 1; i >= 0; i--) {
            hepysort(araray, Tamanho, i, Contages);
        }

        for (int j = Tamanho - 1; j > 0; j--) {
            int temp = araray[0];
            araray[0] = araray[j];
            araray[j] = temp;
            Contages[0]++;
            hepysort(araray, j, 0, Contages);
        }
        System.out.println(Contages[0] + " trocas, " + Contages[1] + " iteracoes.");
    }

    public static void hepysort(int[] araray, int n, int i, int[] Contages) {
        int raize = i;
        int filho_da_esquerda = 2 * i + 1;
        int filho_da_direita = 2 * i + 2;
        Contages[1]++;

        if (filho_da_esquerda < n && araray[filho_da_esquerda] > araray[raize]) {
            raize = filho_da_esquerda;
        }
        if (filho_da_direita < n && araray[filho_da_direita] > araray[raize]) {
            raize = filho_da_direita;
        }

        if (raize != i) {
            int temp = araray[i];
            araray[i] = araray[raize];
            araray[raize] = temp;
            Contages[0]++;
            hepysort(araray, n, raize, Contages);
        }
    }
}
