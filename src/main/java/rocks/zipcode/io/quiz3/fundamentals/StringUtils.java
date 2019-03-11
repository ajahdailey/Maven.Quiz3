package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return null;

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        String charAtIndex = characterToCheckFor.toString(baseString.charAt(indexOfString));
        if(charAtIndex.equalsIgnoreCase(baseString)){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return (n*(n+1)/2) - 1;


    }
}
