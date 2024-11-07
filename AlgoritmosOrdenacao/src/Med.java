public class Med {

    public static long measureExecutionTime(SortAlgorithm algorithm, int[] data) {
        long startTime = System.nanoTime();
        algorithm.sort(data);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
