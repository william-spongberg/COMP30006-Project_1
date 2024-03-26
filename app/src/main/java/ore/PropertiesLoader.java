package ore;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * The PropertiesLoader class is responsible for loading properties from a file.
 */
public class PropertiesLoader {
    /**
     * Loads properties from the specified properties file.
     *
     * @param propertiesFile The path to the properties file.
     * @return A Properties object containing the loaded properties, or null if an error occurs.
     */
    public static Properties loadPropertiesFile(String propertiesFile) {
        try (InputStream input = PropertiesLoader.class.getClassLoader().getResourceAsStream(propertiesFile)) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
