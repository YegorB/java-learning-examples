package com.test;

public class StringUtils {

    /**
     * Method is to replace any charToReplace in inputStr with spaces.
     * In case of trailing spaces string will be returned as is.
     * @param inputStr string to process
     * @param charToReplace to look for
     * @return the new string with replaced characters
     */
    public String replaceWithSpaces(final String inputStr, final char charToReplace) {
        if (inputStr == null) return null;
        return inputStr.replace(charToReplace, ' ');
    }
}