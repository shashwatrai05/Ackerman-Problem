#include <iostream>

int ack(int m, int n) {
    if (m == 0) {
        return n + 1;
    }
    else if (m > 0 && n == 0) {
        return ack(m - 1, 1);
    }
    else if (m > 0 && n > 0) {
        return ack(m - 1, ack(m, n - 1));
    }
}

int main() {
    double A;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 15; j++) {
            A = ack(i, j);
            std::cout << " " << i << " " << j << " -> ";
            std::cout << "A= " << A << std::endl;
        }
    }

    return 0;
}
