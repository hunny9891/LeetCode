"""
Script is a solution for leetcode problem #500
"""
import time

class Solution:
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        first_row = 'qwertyuiop'
        second_row = 'asdfghjkl'
        third_row = 'zxcvbnm'

        words_in_same_row = []
        for word in words:
            lower_word = word.lower()
            in_same_row = True
            search_row = None
            if lower_word[0] in first_row:
                search_row = first_row
            elif lower_word[0] in second_row:
                search_row = second_row
            else:
                search_row = third_row

            for ch in lower_word:
                if ch not in search_row:
                    in_same_row = False
                    break

            if in_same_row is True:
                words_in_same_row.append(word)

        return words_in_same_row

    def find_words_set(self, words):
        first_row = set('qwertyuiop')
        second_row = set('asdfghjkl')
        third_row = set('zxcvbnm')

        words_in_same_row = []
        for word in words:
            lower_word = set(word.lower())
            if first_row & lower_word == lower_word or second_row & lower_word == lower_word or third_row & lower_word == lower_word:
                words_in_same_row.append(word)

        return words_in_same_row


solution = Solution()
start_time = time.time()
print(solution.find_words_set(['Alaska', 'Germany', 'Gas']))
elapsed_time = time.time() - start_time
print('Time elapsed = ' + str(elapsed_time))