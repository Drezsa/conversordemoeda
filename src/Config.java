import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private  static Properties props = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis);

        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar config.properties" + e);
        }
    }

    public static String getApiKey() {
        return props.getProperty("api.key");
    }
}
