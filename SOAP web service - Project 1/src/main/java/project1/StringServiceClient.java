package project1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.util.Scanner;

public class StringServiceClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/StringService?wsdl");

        QName qname = new QName("http://project1.example.com/", "StringManipulationService");
        Service service = Service.create(url, qname);

        StringManipulationService stringService = service.getPort(StringManipulationService.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed String: " + stringService.reverseString(input));
        System.out.println("String Length: " + stringService.getStringLength(input));
    }
}
