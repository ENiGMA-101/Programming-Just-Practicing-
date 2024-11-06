secret_number = 9
i = 0
while i < 3:
    guess = int(input('Guess number : '))
    if secret_number == guess:
        print('Congo, you won. ')
        break
    i += 1
else:
    print('SOrry, Try again. ')
