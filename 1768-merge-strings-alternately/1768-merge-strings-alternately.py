class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        mergedStr = ''
        minVal = min(len(word1), len(word2))
        for i in range(minVal):
            mergedStr += word1[i] + word2[i]
        mergedStr += word1[minVal:] + word2[minVal:]
        return mergedStr