class Solution {
    public int maxDepth(String s) {
        int maxLength = 0, curLength = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                curLength++;
                maxLength = Math.max(curLength, maxLength);
            } else if (s.charAt(i)==')'){
                curLength--;
            }
        }
        return maxLength;
    }
}