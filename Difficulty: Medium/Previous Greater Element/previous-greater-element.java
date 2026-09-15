class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(-1);
        st.push(arr[0]);
        
        for(int i = 1 ; i < arr.length ; i++){
            
        
            while(!st.isEmpty() && st.peek() <= arr[i] ){
                st.pop();
    
            }
            if(st.isEmpty()){
                ans.add(-1);          
            }
            else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
           
            
        }
        return ans;
    }
}