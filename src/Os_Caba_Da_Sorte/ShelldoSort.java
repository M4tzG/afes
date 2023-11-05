package Os_Caba_Da_Sorte;

public class ShelldoSort {

    public static void shellSort(int array[], int Tamanho_do_cabra, int[] Contages) {

        int caba_da_troca, posicaoe_de_pulo;
        // defini quantos pulos vai terq ta dano
        int saltados = Tamanho_do_cabra / 2;

        // enquanto o tamanho do pulo dao for maior q 0
        while (saltados > 0) {
            for (int i = saltados; i < Tamanho_do_cabra; i++) {
                caba_da_troca = array[i];
                posicaoe_de_pulo = i; // verificando onde o elemento pode entrar
                Contages[1]++;
                while (posicaoe_de_pulo >= saltados && array[posicaoe_de_pulo - saltados] > caba_da_troca) {
                    array[posicaoe_de_pulo] = array[posicaoe_de_pulo - saltados];
                    posicaoe_de_pulo = posicaoe_de_pulo - saltados;
                    Contages[0]++;
                }
                array[posicaoe_de_pulo] = caba_da_troca;
            }
            saltados = saltados / 2;
        }
    }
}
