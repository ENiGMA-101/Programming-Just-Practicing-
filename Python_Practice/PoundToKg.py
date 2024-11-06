weight = float(input('Weight : '))
unit = input('For Pound (L) or For KG (K) : ')
if unit == "L" or unit == "l":
    converted = weight * 0.45
    print(f"Your weight is {converted} KG.")
elif unit == "K" or unit == 'k' :
    converted = weight / 0.45
    print(f"Your weight is {converted} Pounds. ")
else:
    print('Enter correctly. ')