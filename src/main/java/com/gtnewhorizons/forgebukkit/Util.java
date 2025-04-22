package com.gtnewhorizons.forgebukkit;

public class Util {

    public static String scapeString(String value) {
        StringBuilder sb = new StringBuilder("\"");

        for (int i = 0; i < value.length(); ++i) {
            char charAt = value.charAt(i);

            if (charAt == '\\' || charAt == '"') {
                sb.append('\\');
            }

            sb.append(charAt);
        }
        return sb.append('"').toString();
    }

}
