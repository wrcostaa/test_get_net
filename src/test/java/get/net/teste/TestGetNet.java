package get.net.teste;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestGetNet {

    @Test
    public void getPageOneTest() {
        // Configurar o caminho comúm de acesso a minha API Rest
        baseURI = "https://reqres.in/api";

        given().
                param("page", "1").
        when().
                get(baseURI).
        then().
                statusCode(404);
    }
}
