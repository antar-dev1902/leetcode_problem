class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min1=prices[0]
        profit=0
        max1=[]
        for x in range(1,len(prices)):
            if prices[x]<min1:
                min1=prices[x]
     
            profit=prices[x]-min1 
            max1.append(profit)   
        if max1:
            return max(max1)
        else:
            return 0



                    