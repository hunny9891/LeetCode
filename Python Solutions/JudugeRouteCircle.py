class Solution:
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        moves = moves.lower()
        uCount = 0
        rCount = 0
        lCount = 0
        dCount = 0

        for c in moves:
            if c == 'u':
                uCount+=1
            elif c == 'd':
                dCount+=1
            elif c == 'r':
                rCount+=1
            elif c == 'l':
                lCount+=1

        if (uCount - dCount) == 0 and (lCount - rCount) == 0:
            return True
        else:
            return False



x = Solution()
print(x.judgeCircle('UD'))