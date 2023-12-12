package InterviewQuestionBank;
/*8
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
**/

public class TestAPI {
    public static void main(String[] args) {
/**        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";

        String response = given().log().all()
                .header("Content-Type", "application/json")
                .when().get("todos/1")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println(response);

        // ---- you need to parse the json got from system.out in previous step as this is json body
        JsonPath js = new JsonPath(response); //for parsing json and this requires string as an argument

        String title = js.getString("title");
        System.out.println("key title is -> " + title);

        //using request specification
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/")
                .addHeader("Content-Type", "application/json").build();

        req = given().spec(req).body("{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}");

        //ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        ResponseSpecification res = new ResponseSpecBuilder().build();
        res = (ResponseSpecification) req.when().get("todos/1")
                .then().extract().response();
        System.out.println(res.toString());

 **/
    }
}
