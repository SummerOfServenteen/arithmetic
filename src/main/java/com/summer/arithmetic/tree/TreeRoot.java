package com.summer.arithmetic.tree;

import java.util.Arrays;

/**
 * @Description: java类作用描述
 * @Author: summer
 * @CreateDate: 2021/5/12
 */
public class TreeRoot {
    private TreeNode treeRoot;

    public TreeNode getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeNode treeRoot) {
        this.treeRoot = treeRoot;
    }

    public static void createTree(TreeRoot treeRoot, int value) {
        if (treeRoot.getTreeRoot() == null) {
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        }else {
            TreeNode tempRoot = treeRoot.getTreeRoot();
            while (tempRoot !=null){
                if(value > tempRoot.getValue()){
                    if(tempRoot.getRightNode() == null){
                        tempRoot.setRightNode(new TreeNode(value));
                        return;
                    }else {
                        tempRoot = tempRoot.getRightNode();
                    }
                }else {
                    if(tempRoot.getLefTreeNode() == null){
                        tempRoot.setLefTreeNode(new TreeNode(value));
                        return;
                    }else {
                        tempRoot = tempRoot.getLefTreeNode();
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5};
        TreeRoot root = new TreeRoot();
        for(int value : arr){
            createTree(root,value);
        }



    }
}
