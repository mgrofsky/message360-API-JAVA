/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum IfMachine32Enum {
    CONTINUE, //TODO: Write general description for this element
    HANGUP; //TODO: Write general description for this element

    private static TreeMap<String, IfMachine32Enum> valueMap = new TreeMap<String, IfMachine32Enum>();
    private String value;

    static {
        CONTINUE.value = "continue";
        HANGUP.value = "hangup";

        valueMap.put("continue", CONTINUE);
        valueMap.put("hangup", HANGUP);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static IfMachine32Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of IfMachine32Enum values to list of string values
     * @param toConvert The list of IfMachine32Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<IfMachine32Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (IfMachine32Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 