with open('Alphabets.txt') as fh:
    count_capitals = 0
    count_digit = 0
    text = fh.read()
    for ch in text:
        if ch.isupper():
            count_capitals += 1
        elif ch.isdigit():
            count_digit += 1
print(count_capitals)
print(count_digit)