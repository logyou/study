package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyh
 * @date 2019/10/30 0030
 **/
public class Tree {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        f(root, list, root.val + "");
        return list;
    }

    public static void f(TreeNode root, List<String> list, String path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        if (root.left != null) {
            f(root.left, list, path + "->" + root.left.val);
        }
        if (root.right != null) {
            f(root.right, list, path + "->" + root.right.val);
        }
    }

    public static void bst2(TreeNode root, TreeNode node) {
        if (root == null) {
            return;
        }
        bst2(root.left, node);
        node = node.right = new TreeNode(root.val);
        bst2(root.right, node);
    }

    static TreeNode node = new TreeNode(0);
    static TreeNode curr = node;

    public static void bst3(TreeNode root) {
        if (root == null) {
            return;
        }
        bst3(root.left);
        curr = curr.right = new TreeNode(root.val);
        bst3(root.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
//        t2.right = t5;

        TreeNode curr = new TreeNode(0);
        TreeNode tt = curr;
        bst2(t1, curr);
        TreeNode temp = tt.right;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.right;
        }
    }
}
