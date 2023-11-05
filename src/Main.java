import Os_Caba_Da_Sorte.ChārùSort;
import Os_Caba_Da_Sorte.AwaSort;
import Os_Caba_Da_Sorte.A_Selecao_Sort;
import Os_Caba_Da_Sorte.MergianaSort;
import Os_Caba_Da_Sorte.QuicksilverSort;
import Os_Caba_Da_Sorte.RipBoSort;
import Os_Caba_Da_Sorte.ShelldoSort;


import java.util.Random;

class Main {

    public static int Tamanho(int[] array){
        int compridomento = 0;
        for (int elemento : array) {
            compridomento++;
        }
        return compridomento;
    }
    public static void Printado(int array[], int Tamano, long tempuru) {
        System.out.print("[ ");
        for (int i = 0; i < Tamano; i++) {
            System.out.print(array[i]);
            if (i < Tamano - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println("Tempo: " + tempuru + " milissegundos\n");
    }

    public static void GeradoNUmeroDOAlexandro(int INterado) {

    }


    public static void main(String args[]) {


        Random random = new Random();
        int[] arreyo_1 = {50, 500, 1000, 5000, 10000};

        // sheldo sort
        for (int Tamanyo : arreyo_1) {
            int[] araray = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                araray[i] = random.nextInt(Tamanyo); // Aleatóriao
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long comeco = System.nanoTime();
            ShelldoSort.shellSort(araray, Tamanho(araray), Contages);
            long finnale = System.nanoTime();
            long temperu = (finnale - comeco) / 1000000; // milisegundado
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            Printado(araray, Tamanyo, temperu);
        }


        //ripbozo
        for (int Tamanyo : arreyo_1) {
            int[] array = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                array[i] = random.nextInt(Tamanyo);
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long inicio = System.nanoTime();
            RipBoSort.HeepySort(array, Tamanyo, Contages);
            long fim = System.nanoTime();
            long tempo = (fim - inicio) / 1000000;
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            Printado(array, Tamanyo, tempo);
        }

        // quicksilverSort
        for (int Tamanyo : arreyo_1) {
            int[] array = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                array[i] = random.nextInt(Tamanyo);
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long inicio = System.nanoTime();
            QuicksilverSort.Qicksilver(array, 0, Tamanyo -1, Contages);
            long fim = System.nanoTime();
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            long tempo = (fim - inicio) / 1000000;
            Printado(array, Tamanyo, tempo);
        }

        // MorganaSort
        for (int Tamanyo : arreyo_1) {
            int[] array = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                array[i] = random.nextInt(Tamanyo);
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long inicio = System.nanoTime();
            Os_Caba_Da_Sorte.MergianaSort.Morganah(array, Tamanyo, Contages);
            long fim = System.nanoTime();
            long tempo = (fim - inicio) / 1000000;
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            Printado(array, Tamanyo, tempo);
        }

        // awaSort
        for (int Tamanyo : arreyo_1) {
            int[] array = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                array[i] = random.nextInt(Tamanyo);
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long inicio = System.nanoTime();
            Os_Caba_Da_Sorte.AwaSort.AwaSort(array, Tamanyo, Contages);
            long fim = System.nanoTime();
            long tempo = (fim - inicio) / 1000000;
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            Printado(array, Tamanyo, tempo);
        }

        // Selectio
        for (int Tamanyo : arreyo_1) {
            int[] array = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                array[i] = random.nextInt(Tamanyo);
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long inicio = System.nanoTime();
            A_Selecao_Sort.FlamingoSort(array, Tamanyo, Contages);
            long fim = System.nanoTime();
            long tempo = (fim - inicio) / 1000000;
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            Printado(array, Tamanyo, tempo);
        }

        // Insercciones
        for (int Tamanyo : arreyo_1) {
            int[] array = new int[Tamanyo];

            for (int i = 0; i < Tamanyo; i++) {
                array[i] = random.nextInt(Tamanyo);
            }

            System.out.println("Tamanho: " + Tamanyo);
            int[] Contages = { 0, 0 };
            long inicio = System.nanoTime();
            ChārùSort.ChārùSort(array, Tamanyo, Contages);
            long fim = System.nanoTime();
            long tempo = (fim - inicio) / 1000000;
            System.out.println(Contages[1] + " iteracoes." + Contages[0] + " trocas, ");
            Printado(array, Tamanyo, tempo);
        }
    }
}
