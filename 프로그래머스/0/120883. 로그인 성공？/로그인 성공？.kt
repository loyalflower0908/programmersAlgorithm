class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        for(user in db){
            if(user[0] == id_pw[0]){
                if(user[1] == id_pw[1]){
                    return "login"
                }else{
                    return "wrong pw"
                }
            }
        }
        return "fail"
    }
}