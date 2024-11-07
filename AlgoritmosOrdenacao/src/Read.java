import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public static int[] readData(String fileName) {
        List<Integer> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                Read.class.getResourceAsStream("/conjuntodedados/" + fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                dataList.add(Integer.parseInt(line));
            }
        } catch (IOException | NullPointerException e) {
            System.err.println("Arquivo não legível: " + e.getMessage());
        }

        return dataList.stream().mapToInt(Integer::intValue).toArray();
    }
}

