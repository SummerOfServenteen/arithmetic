package com.summer.arithmetic.tree;

/**
 * @Description: java类作用描述
 * @Author: summer
 * @CreateDate: 2021/5/12
 */
public class TreeSort {

    private static TreeNode root;

    static {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);
        treeNode1.setLefTreeNode(treeNode2);
        treeNode1.setRightNode(treeNode3);

        //treeNode3.setLefTreeNode(treeNode4);
        //treeNode3.setRightNode(treeNode5);
        root = treeNode1;
    }

    public static void main(String[] args) {

        //preTraverseTree(root);

        //midTraverseTree(root);

        //afterTraverseTree(root);

        System.out.println(getHeight(root));
    }

    public static int getHeight(TreeNode treeNode) {

        if (treeNode == null) {
            return 0;
        } else {
            int left = getHeight(treeNode.getLefTreeNode());
            int right = getHeight(treeNode.getRightNode());
            int max = left;
            if (right > max) {
                max = right;
            }
            return max + 1;
        }
    }

    /**
     * 先序遍历
     *
     * @param rootTreeNode rootTreeNode
     */
    public static void preTraverseTree(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问根节点
            preTraverseTree(rootTreeNode.getLefTreeNode());
            //访问根节点
            preTraverseTree(rootTreeNode.getRightNode());
        }
    }

    /**
     * 中序遍历
     *
     * @param rootTreeNode rootTreeNode
     */
    public static void midTraverseTree(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {

            midTraverseTree(rootTreeNode.getLefTreeNode());

            System.out.println(rootTreeNode.getValue());

            midTraverseTree(rootTreeNode.getRightNode());
        }

    }

    /**
     * 后续遍历
     *
     * @param rootTreeNode rootTreeNode
     */
    public static void afterTraverseTree(TreeNode rootTreeNode) {
        if (rootTreeNode != null) {
            afterTraverseTree(rootTreeNode.getLefTreeNode());
            afterTraverseTree(rootTreeNode.getRightNode());
            System.out.println(rootTreeNode.getValue());
        }

    }
}
