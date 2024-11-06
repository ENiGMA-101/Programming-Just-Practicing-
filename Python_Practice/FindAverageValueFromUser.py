numbers = input('Enter Numbers : ')
number_list = numbers.split()
number_list = [float(num) for num in number_list ]
sum = 0 
avg =0
for number in number_list:
    sum += number
avg = sum/len(number_list)
print(f"Sum of the numbers {sum}")
print(f"Average of the numbers {avg}")
