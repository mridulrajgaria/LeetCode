class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(root,targetSum,path,answer);
        return answer;
    }
    public void dfs(TreeNode root, int targetSum,List<Integer> path, List<List<Integer>> answer){
        if(root==null){
            return;
        }
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
                answer.add(new ArrayList<>(path));
            }
            path.remove(path.size()-1);
            return;
        }
        if(root.right!=null){
            dfs(root.right,targetSum-root.val,path,answer);
        }
        if(root.left!=null){
            dfs(root.left,targetSum-root.val,path,answer);
        }
        path.remove(path.size()-1);
    }
}