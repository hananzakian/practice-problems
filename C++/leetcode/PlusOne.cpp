// Problem: https://leetcode.com/problems/plus-one/description/

# include <iostream>
# include <vector>

using namespace std;

vector<int> plusOne(vector<int>& vectorX) {

    vectorX.back() += 1; // tambahkan 1 di elemen terakhir

    for (size_t n = 0; n < vectorX.size(); n++)
    {
        for (size_t i = 0; i < vectorX.size(); i++) {

            if (vectorX[i] > 9) { // jika ada elemen yang di atas 9 (setelah ditambah 1)

                if (vectorX[0] > 9) { // jika elemen pertama yang di atas 9 (setelah ditambah 1)
                    vectorX.resize(vectorX.size() + 1, 0); // perbesar vector/array
                    vectorX[0] = 1; // elemen vector/array pertama jadikan bernilai 1
                    for (size_t j = 1; j < vectorX.size(); j++) { // vector/array selanjutnya jadikan bernilai 0 sampai akhir
                        vectorX[j] = 0;
                    }
                } else {
                    vectorX[i] = 0; // ubah elemen jadi 0
                    vectorX[i-1] += 1;  // ubah elemen sebelumnya jadi 1
                }

            }
        }
    }
    return vectorX;
}

int main() {

    vector<int> vectorA = {9,9};

    plusOne(vectorA);

    cout << vectorA.size() << "\n";

    for (size_t i = 0; i < vectorA.size() ; i++)
    {
        cout << vectorA[i] << " ";
    }

    return 0;
}