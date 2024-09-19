def ack(m, n):
    if m == 0:
        return n + 1
    elif m > 0 and n == 0:
        return ack(m - 1, 1)
    elif m > 0 and n > 0:
        return ack(m - 1, ack(m, n - 1))

A = 0.0
for i in range(4):
    for j in range(15):
        A = ack(i, j)
        print(f" {i} {j} -> A= {A}")
