package Os_Caba_Da_Sorte;

public class A_Selecao_Sort {

    public static void FlamingoSort(int[] arary, int Tamanico, int[] Contages) {

        for (int i = 0; i < Tamanico - 1; i++) {
            int D_Menoh = i;
            for (int j = i + 1; j < Tamanico; j++) {
                Contages[1]++;
                if (arary[j] < arary[D_Menoh]) {
                    D_Menoh = j;
                }
            }
            int Ichiji_teki = arary[D_Menoh];
            arary[D_Menoh] = arary[i];
            arary[i] = Ichiji_teki;
            Contages[0]++;
        }
    }

}
