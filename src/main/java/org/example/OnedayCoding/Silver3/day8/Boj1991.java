package org.example.OnedayCoding.Silver3.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1991 {

    // The main method must be in a class named "Main".
    class Main {
        private static Node[] tree;
        private static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int N  = Integer.parseInt(br.readLine());
            tree = new Node[N];
            for(int i = 0 ; i < N ; i++){
                st = new StringTokenizer(br.readLine());
                char root = st.nextToken().charAt(0);
                char left = st.nextToken().charAt(0);
                char right = st.nextToken().charAt(0);
                if(tree[root - 'A'] == null){
                    tree[root - 'A'] = new Node(root);
                }
                if(left != '.'){
                    tree[left -'A'] = new Node(left);
                    tree[root - 'A'].left = tree[left - 'A'];
                }
                if(right != '.'){
                    tree[right -'A'] = new Node(right);
                    tree[root - 'A'].right = tree[right - 'A'];
                }

            }

            preOrder(tree[0]);
            sb.append("\n");
            inOrder(tree[0]);
            sb.append("\n");
            postOrder(tree[0]);
            System.out.print(sb.toString());
        }
        private static void preOrder(Node node){
            if(node == null) return;
            sb.append(node.root);
            preOrder(node.left);
            preOrder(node.right);
        }
        private static void inOrder(Node node){//왼 중 오
            if(node == null) return;
            inOrder(node.left);
            sb.append(node.root);
            inOrder(node.right);
        }
        private static void postOrder(Node node){
            if(node == null) return;
            postOrder(node.left);
            postOrder(node.right);
            sb.append(node.root);
        }

        private static class Node{
            char root;
            Node left;
            Node right;
            public Node(char root){
                this.root = root;
                this.left = null;
                this.right = null;
            }
        }
    }
}
