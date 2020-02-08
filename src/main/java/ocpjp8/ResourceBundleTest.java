package ocpjp8;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        Locale loc = Locale.US;
        ResourceBundle bundle = ResourceBundle.getBundle("ResourceBundle", loc);
        Enumeration<String> enumeration = bundle.getKeys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            String val = bundle.getString(key);
            System.out.println(key + "=" + val);
        }
    }
}
