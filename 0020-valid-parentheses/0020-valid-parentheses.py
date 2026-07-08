class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for char in s:
            if char in "({[":
                stack.append(char)
            else:
                if not stack:
                    return False
                if char==")" and stack[len(stack)-1]=="(":
                    stack.pop()
                elif char=="}" and stack[len(stack)-1]=="{":
                    stack.pop()  
                elif char=="]" and stack[len(stack)-1]=="[":
                    stack.pop()  
                else:
                    return False          
        if stack:
            return False
        else:
            return True                

