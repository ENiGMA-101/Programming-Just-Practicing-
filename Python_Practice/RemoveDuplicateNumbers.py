array = input('Enter numbers : ')
array_list = array.split()
array_list = [int(number) for number in array_list]
array2 = []
for num in array_list:
    if num not in array2:
        array2.append(num)
array = array2.copy()
print(array)
