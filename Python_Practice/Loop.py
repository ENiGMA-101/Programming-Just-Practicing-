numbers = input('Enter Numbers : ')
number_list = numbers.split()
number_list = [float(num) for num in number_list ]
sum = 0
for number in number_list:
    sum += number
print(f"Sum of the numbers {sum}")