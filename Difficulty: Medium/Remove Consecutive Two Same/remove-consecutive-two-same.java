class Solution {
    public String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if (st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()){
            return "-1";
        }
        String ans = "";
        
        while(!st.isEmpty()){
            ans = st.pop() + ans;
            
        }
        return ans;

    }
}