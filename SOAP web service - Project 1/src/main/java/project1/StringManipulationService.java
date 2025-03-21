package project1;

        import javax.jws.WebMethod;
        import javax.jws.WebService;

@WebService
public class StringManipulationService {

    @WebMethod
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @WebMethod
    public int getStringLength(String input) {
        return input.length();
    }
}