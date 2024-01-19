class Solution {
    fun solution(a: Int, b: Int): Int {
        if(a%b==0){
            return 1
        }
        var x = a
        var y = b
        for(i in 2..b){
            while(x%i == 0 && y%i==0){
                x /= i
                y /= i
            }
        }
        return if(y%2==0||y%5==0){
            while(y%2==0||y%5==0){
                if(y%2==0){
                    y/=2
                }else if(y%5==0){
                    y/=5
                }
            }
            if(y==1){
                return 1
            }else{
                return 2
            }
        }else{
            2
        }
    }
}