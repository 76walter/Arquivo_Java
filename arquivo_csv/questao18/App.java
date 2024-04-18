import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\walter\\Documentos\\ArquivoJava\\arquivo_csv\\questao18\\alunos.csv"))) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                System.out.println("Nome: " + line[0] + ", Idade: " + line[1] + ", Nota: " + line[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
