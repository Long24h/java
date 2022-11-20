package utils;

import java.util.regex.Pattern;

public class ValidateUltils {
    public static final String NAME_PATTERN = "";
    public static final String QUANTITY_PATTERN = "^[1-100000]$";
    public static final String PRICE_PATTERN = "^[1-100000]$";
    public static boolean isNameValid(String name) {
        return Pattern.compile(NAME_PATTERN).matcher(name).matches();
    }
}
