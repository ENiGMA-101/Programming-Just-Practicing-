def calculate_total_distance(n, m, r, c):
    total_distance = 0
    for row in range(r, n):
        for col in range(c, m):
            total_distance += abs(row - row) + abs(col - (col - 1))
    return total_distance

# Read the number of test cases
t = int(input())

for _ in range(t):
    n, m, r, c = map(int, input().split())
    total_distance = calculate_total_distance(n, m, r, c)
    print(total_distance)