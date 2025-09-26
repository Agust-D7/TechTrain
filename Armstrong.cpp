#include <iostream>
#include <cmath>
using namespace std;

// Function to check if a number is an Armstrong number
bool isArmstrong(int num) {
    int original = num;
    int sum = 0;
    int count = 0;

    // Count the number of digits
    int temp = num;
    while (temp > 0) {
        count++;
        temp /= 10;
    }

    // Calculate the sum of each digit raised to the power of number of digits
    temp = num;
    while (temp > 0) {
        int digit = temp % 10;
        sum += pow(digit, count);
        temp /= 10;
    }

    return sum == original;
}

int main() {
    int number;
    cout << "Enter a number: ";
    cin >> number;

    if (isArmstrong(number)) {
        cout << number << " is an Armstrong number." << endl;
    } else {
        cout << number << " is not an Armstrong number." << endl;
    }

    return 0;
}
