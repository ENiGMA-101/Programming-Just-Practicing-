price = input('What is the price? ')
down_payment = True
if down_payment:
    down_payment = 0.1 * int(price)
else:
    down_payment = 0.2 * int(price)
print(f"Down Payment ${down_payment}")