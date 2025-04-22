package com.gtnewhorizons.forgebukkit;

/**
 * Used in place we need a custom toString, but changing the original class toString can break things
 */
public interface ICrucibleString {
    default String crucible_toString() {
        throw new UnsupportedOperationException("ICrucibleString is not properly implemented on this class");
    }
}
