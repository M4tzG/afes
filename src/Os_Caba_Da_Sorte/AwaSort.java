package Os_Caba_Da_Sorte;

public class AwaSort {
    public static void AwaSort(int[] araray, int Tamanico, int[] Contages) {

        for (int i = 0; i < Tamanico - 1; i++) {
            for (int j = 0; j < Tamanico - i - 1; j++) {
                Contages[1]++;
                if (araray[j] > araray[j + 1]) {
                    int Ichiji_teki = araray[j];
                    araray[j] = araray[j + 1];
                    araray[j + 1] = Ichiji_teki;
                    Contages[0]++;
                }
            }
        }
    }
}
