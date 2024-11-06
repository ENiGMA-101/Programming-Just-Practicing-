numbers = input('Enter Numbers : ')
number_list = numbers.split()
number_list = [float(num) for num in number_list ]
max = number_list[0]
for number in number_list:
    if number > max:
        max = number
print(f"Max number {max}")
