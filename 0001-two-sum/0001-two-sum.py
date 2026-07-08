class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        x={}
        for y in range(len(nums)):
            a=target-nums[y] 
            if a not in x:
                x[nums[y]]=y
            else:
                return [x[a],y]    

        
        


        



        