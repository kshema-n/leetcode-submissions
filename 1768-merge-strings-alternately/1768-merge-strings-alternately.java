class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = new String();
        while(word1.length() > 0 && word2.length() > 0){
            merged = merged + word1.charAt(0);
            merged = merged + word2.charAt(0);
            word1 = word1.substring(1);
            word2 = word2.substring(1);
        }
        if(word1.length() > word2.length()) merged = merged + word1;
        else merged = merged + word2;

        return merged;
    }
}