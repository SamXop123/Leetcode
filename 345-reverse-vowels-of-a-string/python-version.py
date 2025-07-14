class Solution(object):
    def reverseVowels(self, s):
       
        newStr = ""
        vowels = "aeiouAEIOU"
        vowel_list = []

        for char in s:
            if char in vowels:
                vowel_list.append(char)

        vowel_list.reverse()

        for char in s:
            if(char in vowels):
                newStr += vowel_list.pop(0)
            else:
                newStr += char

        return newStr
