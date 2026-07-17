class Solution {
    public boolean isValid(String s) {
        Stack<Character> dummy = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('|| c=='[' || c== '{'){
                dummy.push(c);
            }
            else{
                if(dummy.isEmpty()){
                    return false;
                }
                char top = dummy.pop();
                if(c==')' && top!= '(')
                    return false;
                if(c=='}' && top!= '{')
                    return false;
                if(c==']' && top!= '[')
                    return false;
            }
        } 
        return dummy.isEmpty();
    }
}