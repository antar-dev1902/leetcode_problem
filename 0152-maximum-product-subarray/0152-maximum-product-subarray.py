class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        curent_prod=nums[0]
        max_prod=nums[0]
        min_prod=nums[0]
        for num in nums[1:]:
            temp1=curent_prod
            temp2=min_prod
            curent_prod=max(num,temp1*num,temp2*num)
            min_prod=min(num,temp1*num,temp2*num)
            max_prod=max(max_prod,min_prod,curent_prod)
        return max_prod    
        