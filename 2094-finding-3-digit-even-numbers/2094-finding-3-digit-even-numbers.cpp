class Solution {
public:
    vector<int> findEvenNumbers(vector<int>& digits) {
        
        int freq[10] = {0};

        int di = digits.size();
        for(int i=0; i<di; i++){
            freq[digits[i]]++;
        }

        vector<int> res;
        for(int i=1; i<10; i++){
            if(freq[i]){
                for(int j=0; j<10; j++){
                    if(freq[j] > (i==j)){
                        for(int k=0; k<10; k+=2){
                            if(freq[k] > ((i==k) + (j==k))){
                                res.push_back(i*100 + j*10 + k);
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
};