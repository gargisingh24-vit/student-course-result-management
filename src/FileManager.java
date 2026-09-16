import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveData(String data) {
        try {
            FileWriter writer = new FileWriter("data/system_data.txt", true);
            writer.write(data + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error while saving data.");
        }
    }
}