// Problem: https://www.codewars.com/kata/56606694ec01347ce800001b

# include <iostream>

using namespace std;

bool isTriangle(int a, int b, int c) {

    if (a + b > c && b + c > a && a + c > b) {
        return true;
    }

    return false;
}


int main() {

    bool tri = isTriangle(-17,15,20);

    cout << tri;

    return 0;
}