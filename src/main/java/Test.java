/**
 * Created by stefan.durla on 10/06/2017.
 */
import static spark.Spark.*;

public class Test {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
