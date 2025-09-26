#include <iostream>
using namespace std;

// Function to check if a number is a palindrome
bool isPalindrome(int num) {
    int original = num;
    int reversed = 0;

    while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;
}

int main() {
    cout << "Palindrome numbers from 1000 to 10000:\n";
    for (int i = 1000; i <= 9999; ++i) {
        if (isPalindrome(i)) {
            cout << i << " ";
        }
    }
    cout << endl;
    return 0;
}
