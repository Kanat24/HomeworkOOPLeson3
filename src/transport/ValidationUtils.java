package transport;

public class ValidationUtils {
    public static String validOrDefault(String value, String defaultValue){
        return value ==null || value.isBlank()  || value.isEmpty() ? defaultValue : value;
    }
}
