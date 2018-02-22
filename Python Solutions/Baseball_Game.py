'''
Solution to leetcode problem # 682. Baseball Game
'''
class Solution:
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """


import sklearn.preprocessing as preprocessing

x = [[0, 0], [0, 1], [2,0]]
enc = preprocessing.OneHotEncoder()
print(enc.fit(x).transform([[1, 1]]).toarray())
