class Solution {
    //making a static helper function
    public void helper(int[] candidates,int target, int indx, List<Integer> ele, List<List<Integer>> ans){

        //base case
        if(indx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ele));
                return;
            }else return;
        }

        //--logic and inner calls--


        //taking element
        if(candidates[indx]<=target){
            ele.add(candidates[indx]);
            helper(candidates,target-candidates[indx],indx,ele,ans);

            //backtracking step
            ele.remove(ele.size()-1);
        }

        //not taking element
        helper(candidates,target,indx+1,ele,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {    
        //making like main function 
        
        List<Integer> ele=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,target,0,ele,ans);

        return ans;           
    }
}
