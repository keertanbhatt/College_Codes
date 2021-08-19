letter = input("Input an alphabet: ")



if letter in ('a', 'e', 'i', 'o', 'u'):

    print("%s is a vowel." % letter)

else:

    print("%s is a consonant." % letter)
    letter = input("Input an alphabet: ")
