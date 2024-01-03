package Test;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Date;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Formdata {

    private final Logger logger = LoggerFactory.getLogger(FileUploadTest.class);


    public void fileUploadTest() {
        given()
                .param("timestamp", new Date().getTime())
                .multiPart("file", new File("/path/to/file.json"))
                .accept(ContentType.JSON)
                .when()
                .post("http://localhost:8080/fileupload")
                .then()
                .statusCode(200)
                .body("success", equalTo(true));
    }
}