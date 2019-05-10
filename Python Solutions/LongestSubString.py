class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0:
            return 0
        temp = s[0]
        max_len = 1
        
        for char in s[1:]:
            if char in temp:
                index = temp.find(char)
                temp = temp[index+1:]
            temp += char

            if len(temp) > max_len:
                max_len = len(temp)

        return max_len


sol = Solution()
print(sol.lengthOfLongestSubstring("abcbabbc"))