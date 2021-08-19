print("Enter the String:")
text = input()
print("Enter the Character:")
char = input()
textLen = len(text)
sum = 0
for i in range(textLen):
    if char==text[i]:
        sum = sum+1
print("Occurrence of Given Character is:")
print(sum)
