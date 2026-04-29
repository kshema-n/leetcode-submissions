class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        l, r = 0, len(nums)
        for i in range(r):
            if nums[i] != 0:
                nums[l], nums[i] = nums[i], nums[l] 
                l+=1
        return nums