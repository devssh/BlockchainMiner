package app.utils;

import org.springframework.web.client.RestTemplate;

public class RequestUtil {
    public static <T> T GetRequest(String uri, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, clazz);
    }
}
