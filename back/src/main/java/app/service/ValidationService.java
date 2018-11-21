package app.service;

import java.util.List;

public interface ValidationService {
    /**
     * This method check elements from List<String> for valid.
     * If element have size more then 18, it is not valid.
     *
     * @param list List of String elements from user's input
     * @return boolean
     */
    boolean isValidSizeOfNumber(List<String> list);

    /**
     * Validation method.
     * If element is negative, it is not valid.
     *
     * @param list List of String elements from user's input
     * @return boolean
     */
    boolean isPositiveNumber(List<String> list);

    /**
     * Validation method.
     * If element isn't a number, it is not valid.
     *
     * @param list List of String elements from user's input
     * @return
     */
    boolean isNumber(List<String> list);
}
