name = input('What is your name ? ')
if len(name) <3:
    print('Name must be at least 3 character.')
elif len(name) >50:
    print('Name can be maximum of 50 characters.')
else:
    print('Name looks Good.')