public class Main {

    public static void main(String[] args) {
        String[] files = {"aleatorio_100.csv", "aleatorio_1000.csv", "aleatorio_10000.csv",
                "crescente_100.csv", "crescente_1000.csv", "crescente_10000.csv",
                "decrescente_100.csv", "decrescente_1000.csv", "decrescente_10000.csv"};

        SortAlgorithm[] algorithms = {new BubbleSort(), new InsertionSort(), new QuickSort()};
        String[] algorithmNames = {"BubbleSort", "InsertionSort", "QuickSort"};

        for (String file : files) {
            System.out.println("Arquivo: " + file);
            int[] originalData = Read.readData(file);

            for (int i = 0; i < algorithms.length; i++) {
                int[] dataCopy = originalData.clone();
                long executionTime = Med.measureExecutionTime(algorithms[i], dataCopy);
                System.out.println(algorithmNames[i] + " tempo de execução: " + executionTime + " ns");
            }
            System.out.println();
        }
    }
}
