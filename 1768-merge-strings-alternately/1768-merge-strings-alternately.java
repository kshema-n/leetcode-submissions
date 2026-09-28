class Solution {
    public String mergeAlternately(String word1s, String word2s) {
        StringBuilder merged = new StringBuilder();
        StringBuilder word1 = new StringBuilder(word1s);
        StringBuilder word2 = new StringBuilder(word2s);

        while(word1.length() > 0 && word2.length() > 0){
            merged.append(word1.charAt(0));
            merged.append(word2.charAt(0));
            word1.deleteCharAt(0);
            word2.deleteCharAt(0);
        }
        if(word1.length() > word2.length()) merged.append(word1);
        else merged.append(word2);

        return merged.toString();
    }
}