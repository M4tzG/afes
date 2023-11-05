package Os_Caba_Da_Sorte;

public class QuicksilverSort {


    public static void Qicksilver(int[] araray, int Menoh_doPedaco, int Maioh_doPedaco, int[] Contages) {


        if (Menoh_doPedaco < Maioh_doPedaco) {
            int Pivet = particionah(araray, Menoh_doPedaco, Maioh_doPedaco, Contages);
            Qicksilver(araray, Menoh_doPedaco, Pivet - 1, Contages);
            Qicksilver(araray, Pivet + 1, Maioh_doPedaco, Contages);
        }

    }

    private static int particionah(int[] araray, int Menoh_doPedaco, int Maioh_doPedaco, int[] Contages) {
        int Pivet = araray[Maioh_doPedaco];
        int i = (Menoh_doPedaco - 1);
        for (int j = Menoh_doPedaco; j < Maioh_doPedaco; j++) {
            Contages[1]++; // iteracao
            if (araray[j] < Pivet) {
                i++;
                Contages[0]++; // troca
                int Ichiji_teki = araray[i];
                araray[i] = araray[j];
                araray[j] = Ichiji_teki;
            }
        }
        Contages[0]++;
        int Ichiji_teki = araray[i + 1];
        araray[i + 1] = araray[Maioh_doPedaco];
        araray[Maioh_doPedaco] = Ichiji_teki;
        return i + 1;
    }
}
