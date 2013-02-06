import com.googlecode.utterlyidle.BasePath;
import com.googlecode.utterlyidle.RestApplication;

import static com.googlecode.utterlyidle.ApplicationBuilder.application;

public class Main extends RestApplication {
    public Main(BasePath basePath) {
        super(basePath);
    }

    public static void main(String[] args) {
        application().addAnnotated(MainResource.class).start(8181);
    }
}