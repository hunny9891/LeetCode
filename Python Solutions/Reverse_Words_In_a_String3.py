class Solution:
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = ''
        tokens = []
        for ch in s:
            if ch == ' ':
                tokens.append(result)
                result = ''
            else:
                result = ch + result
        tokens.append(result)
        result = ''
        for i in range(len(tokens)):
            if i == len(tokens) - 1:
                print("hey this is the last token")
                result = result + tokens[i]
            else:
                result += tokens[i] + ' '
        return result


solution = Solution()
print(solution.reverseWords('we are like brothers!!!'))