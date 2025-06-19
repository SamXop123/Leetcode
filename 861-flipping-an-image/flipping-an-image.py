class Solution(object):
    def flipAndInvertImage(self, image):
        
        flipped_arr = []
        for row in image:
            flipped_row = row[::-1]
            flipped_arr.append(flipped_row)

        finalArr = []
        for arr in flipped_arr:
            mirror = []
            for i in arr:
                if i == 0:
                    mirror.append(1)
                else:
                    mirror.append(0)
            finalArr.append(mirror)

        return finalArr
