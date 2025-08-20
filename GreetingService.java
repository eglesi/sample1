/**
 * Exception thrown to indicate that a requested resource could not be found.
 * This custom runtime exception is typically used in service layers or REST APIs
 * when a client attempts to access a non-existent entity.
 */
public class GreetingService {

    public String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Stranger!";
        }
        return "Hello, " + name + "!";
    }
}
