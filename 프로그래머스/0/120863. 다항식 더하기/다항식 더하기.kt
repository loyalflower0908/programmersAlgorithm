class Solution {
    fun solution(polynomial: String) = polynomial.split(' ').let{
        var x = 0
        var num = 0
        var result = ""
        for(i in it){
            if('x' in i){
                if(i.length == 1){
                    x += 1
                }else{
                    x += i.substring(0, i.length - 1).toInt()
                }
            }else if(i != "+"){
                num += i.toInt()
            }
        }
        if(x > 1){
            result = x.toString()
        }
        if(x != 0 && num != 0){
            result += "x + " + num.toString()
        }else if(x != 0){
            result += "x"
        }else if(num != 0){
            result = num.toString()
        }
        result
    }
}