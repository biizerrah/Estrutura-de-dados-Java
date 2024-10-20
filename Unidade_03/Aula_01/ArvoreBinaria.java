class Node{

    int key;
    Node left,right;

    public Node(int item){

        key = item;
        left = null;
        right = null;
    }
}

class BST{

    Node root;

    BST(){

        root = null;
    }

    Node insertion(Node root, int key){

        if(root == null){
            root = new Node(key);
            return root;

        }
        
        if(key < root.key){
            root.left = insertion(root.left, key);
        } else if (key > root.key) {
            root.right = insertion(root.right, key);
        }

        return root;
    }

    void insert(int key){
        root = insertion(root, key);
    };
    public static void main(String[] args){
    
        BST arvore = new BST();
    
        arvore.insert(30);
        arvore.insert(40);
        arvore.insert(20);

        System.out.println(arvore.root.key);
        System.out.println(arvore.root.left.key);
        System.out.println(arvore.root.right.key);
    }
}

