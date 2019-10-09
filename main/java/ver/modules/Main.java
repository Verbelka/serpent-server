package ver.modules;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import ver.modules.serpent.KeyHelper;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Main {
    public static void main(String[] args) {
        System.out.println(new String(KeyHelper.makeKeyFixLength(new byte[]{104, 105}, 10)));
    }
}
