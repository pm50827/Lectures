package hr.fer.oop.recapitulation.staticmethods;

/**
 *
 * @author Krešimir Pripužić <kresimir.pripuzic@fer.hr>
 */
public class BaseClass {
    private final String message1 = "message1";
    private static final String message2 = "message2";

    public String getMessage() {
        return message1;
    }
    public static String getStaticMessage() {
        return message2;
    }
}