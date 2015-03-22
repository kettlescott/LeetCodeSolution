import java.util.HashMap;
import java.util.Map;

public class ConstructPreorderPostorder {

	
	
     public TreeNode build (int [] preorder, int [] postorder){
    	 HashMap<Integer,Integer> map = new HashMap<> ();
    	 for (int i = 0 ; i < postorder.length ; ++i) {
    		 map.put(postorder[i], i) ;
    	 }
    	 TreeNode r = new TreeNode (preorder[0]);
    	 helper (preorder, r, 1, 0, preorder.length - 1, map);
    	  CommonFunction.dumpTree(r);
    	 return null ;
     }
     
     public void helper (int [] preorder ,TreeNode cur, int pre , int left, int right, Map<Integer,Integer> map){
       if (left == right) {
    	   return  ;
       }
       TreeNode L = new TreeNode(preorder[pre]) ;
       int offset = map.get(preorder[pre]) - left + 1 ;       
       TreeNode R = new TreeNode(preorder[pre + offset]) ;
       cur.left = L ;
       cur.right = R ;
       helper (preorder, L , pre + 1 , left,  map.get(preorder[pre]), map);        
       helper (preorder, R , pre + offset + 1 , map.get(preorder[pre]) + 1,  right - 1, map);       
     }

}
