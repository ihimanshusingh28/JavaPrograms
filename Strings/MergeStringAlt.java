package Strings;
//To merge strings in alternate fashion

public class MergeStringAlt {
    public static String mergeStrings(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        
        while (i < s1.length() && j < s2.length()) {
            merged.append(s1.charAt(i++));
            merged.append(s2.charAt(j++));
        }
        
        while (i < s1.length()) {
            merged.append(s1.charAt(i++));
        }
        
        while (j < s2.length()) {
            merged.append(s2.charAt(j++));
        }
        
        return merged.toString();
    }
}
