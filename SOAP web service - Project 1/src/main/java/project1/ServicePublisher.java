package project1;

import javax.xml.ws.Endpoint;

public class ServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/ws/string"; // Change if needed
        Endpoint.publish(url, new StringManipulationService());
        System.out.println("SOAP Web Service Published at " + url);
    }
}
