class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        mergedStr = ''
        word1len = len(word1)
        word2len = len(word2)
        minVal = min(word1len, word2len)
        for i in range(minVal):
            mergedStr += word1[i] + word2[i]
        mergedStr += word1[minVal:] + word2[minVal:]
        return mergedStr