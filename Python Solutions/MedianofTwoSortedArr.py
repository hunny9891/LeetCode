import math

class Solution(object):
    def merge(self, nums1, nums2):
        i = j = k = 0
        n1 = len(nums1)
        n2 = len(nums2)
        nums3 = [None] * (n1 + n2)

        while i < n1 and j < n2:
            if nums1[i] < nums2[j]:
                nums3[k] = nums1[i]
                i += 1
            else:
                nums3[k] = nums2[j]
                j += 1
            k += 1

        while i < n1:
            nums3[k] = nums1[i]
            k += 1
            i += 1

        while j < n2:
            nums3[k] = nums2[j]
            k += 1
            j += 1

        return nums3
    
    # This is 4ms faster than the merge routine above.
    def sortnums(self, num1, num2):
        num1 = num1 + num2
        num1 = sorted(num1)
        return num1

    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        if len(nums1) == 0 and len(nums2) == 0:
            return -1
        else:
            nums3 = self.sortnums(nums1, nums2)
            print(nums3)
            median = None
            totalSize = len(nums3)
            if totalSize % 2 == 0:
                median = (nums3[math.floor(totalSize/2)] + nums3[math.floor((totalSize/2) - 1)]) / 2
            else:
                median = nums3[math.floor(totalSize/2)]
            return median


if __name__ == "__main__":
    nums1 = [1]
    nums2 = [6,7,8]
    sol = Solution()
    ans = sol.findMedianSortedArrays(nums1, nums2)
    print(ans)
