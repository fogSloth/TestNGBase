package TestNG.Introduccion;

import com.thed.zephyr.cloud.rest.ZFJCloudRestClient;
import com.thed.zephyr.cloud.rest.client.JwtGenerator;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class FirstTest {
    String url= "https://prod-play.zephyr4jiracloud.com/connect";
    String accountId = "712020:4b08eaea-698d-4236-9e5a-f33475cdfc5a";

    String secretKey = "TDIBLW5yX0adOYEUyrzSKsAxf75SLpzw9KJ5vyrwm_o";

    String accessKey = "YjQ2NmYxNWUtNDM5Ni0zZGMxLTk2NDktYzFkZmNkZmM0ZDJhIDcxMjAyMCUzQTRiMDhlYWVhLTY5OGQtNDIzNi05ZTVhLWYzMzQ3NWNkZmM1YSBVU0VSX0RFRkFVTFRfTkFNRQ";
    String versionId = "-1";
    @Test
    void setup() throws URISyntaxException {
        System.out.println("Cositas");
    }

}
