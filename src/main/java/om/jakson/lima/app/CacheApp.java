package om.jakson.lima.app;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CacheApp {

    public static void main(String... args) {
        Quarkus.run(args);
    }
}
