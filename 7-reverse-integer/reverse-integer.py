class Solution:
    def reverse(self, x: int) -> int:
        if x < 0:
            sign = -1
        else:
            sign = 1

        x = abs(x)
        
        rev = int(str(x)[::-1])
        rev = rev * sign
        
        if rev < -2**31 or rev > 2**31 - 1:
            return 0

        return rev

