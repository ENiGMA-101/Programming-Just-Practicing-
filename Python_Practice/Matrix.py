matrix = [
    [1,2,6],
    [2,7,9],
    [0,9,7]
]
for row in matrix:
    for item in row:
        print(f"{item:3d}",end="")
    print()