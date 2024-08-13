def sort_characters(word):
    """
    Sort the characters in a string in ascending order.
    """
    # Convert the word to a list of characters
    char_list = list(word)

    # Sort the character list
    char_list.sort()

    # Convert the sorted character list back to a string
    return ''.join(char_list)

# Read the input word from the user
word = input("Enter a word: ")

# Get the sorted characters
sorted_word = sort_characters(word)

# Output the sorted characters
print(sorted_word)


# Dry Run Example:
# Input: "banana"
# Convert to character list: ['b', 'a', 'n', 'a', 'n', 'a']
# Sort the list: ['a', 'a', 'a', 'b', 'n', 'n']
# Convert back to string: "aaannb"
