package Os_Caba_Da_Sorte;

public class MergianaSort {
    public static void Morganah(int[] arary, int Tamanho, int[] Contages) {


        MorganahSort(arary, 0, Tamanho - 1, Contages);
    }

    // mais pra kah = esquerda
    // mais pra lah = direita
    private static void MorganahSort(int[] arary, int Mais_Pra_kah, int Mais_Pra_lah, int[] Contages) { // separa os moço
        if (Mais_Pra_kah < Mais_Pra_lah) {
            int Meiukah = (Mais_Pra_kah + Mais_Pra_lah) / 2;
            MorganahSort(arary, Mais_Pra_kah, Meiukah, Contages);
            MorganahSort(arary, Meiukah + 1, Mais_Pra_lah, Contages);
            Mergeh(arary, Mais_Pra_kah, Meiukah, Mais_Pra_lah, Contages);
        }
    }

    private static void Mergeh(int[] arary, int Mais_Pra_kah, int Meiukah, int Mais_Pra_lah, int[] Contages) { // junta os moço
        int arara1 = Meiukah - Mais_Pra_kah + 1; // vê uma metade
        int arara2 = Mais_Pra_lah - Meiukah; // vê a outra metade

        int[] ararayDum = new int[arara1]; // cria os array de um e outro
        int[] ararayDotro = new int[arara2];

        for (int i = 0; i < arara1; i++) { // add nos bff
            ararayDum[i] = arary[Mais_Pra_kah + i];
        }
        for (int j = 0; j < arara2; j++) {
            ararayDotro[j] = arary[Meiukah + 1 + j];
        }

        int Comp1 = 0, Comp2 = 0;
        int poze_atual = Mais_Pra_kah;
        while (Comp1 < arara1 && Comp2 < arara2) {
            Contages[1]++;

            if (ararayDum[Comp1] <= ararayDotro[Comp2]) {
                arary[poze_atual] = ararayDum[Comp1];
                Comp1++;
            } else {
                arary[poze_atual] = ararayDotro[Comp2];
                Comp2++;
            }
            poze_atual++;
        }

        while (Comp1 < arara1) {
            arary[poze_atual] = ararayDum[Comp1];
            Comp1++;
            poze_atual++;
        }

        while (Comp2 < arara2) {
            arary[poze_atual] = ararayDotro[Comp2];
            Comp2++;
            poze_atual++;
        }
    }

}
