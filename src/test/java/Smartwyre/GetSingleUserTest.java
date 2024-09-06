package Smartwyre;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This test covers:
 * Transform API response to data transfer object and verify the value of a few variables of that object.
 */

public class GetSingleUserTest {

    private static final String BASE_URL = "https://reqres.in";
    private static final String ENDPOINT = "/api/users/2";

    @Test
    public void getSingleUserTest() {

        Response response = RestAssured.get(BASE_URL + ENDPOINT);
        response.prettyPrint();

        SingleCourseResponse singleCourseResponse = response.as(SingleCourseResponse.class);

        Integer id = singleCourseResponse.getData().getId();
        String email = singleCourseResponse.getData().getEmail();
        String firstName = singleCourseResponse.getData().getFirst_name();
        String lastName = singleCourseResponse.getData().getLast_name();

        Assert.assertEquals(response.getStatusCode(), 200, "The status code is not 200");
        Assert.assertEquals(id, 2, "The ID does not match");
        Assert.assertNotNull(email, "Email should not be null");
        Assert.assertEquals(email, "janet.weaver@reqres.in", "The email does not match");
        Assert.assertFalse(firstName.isEmpty(), "First name should not be empty");
        Assert.assertEquals(firstName, "Janet", "First name does not match");
        Assert.assertEquals(lastName, "Weaver", "Last name does not match");


    }
}
