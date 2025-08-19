import java.util.Scanner;

public class tree { 
    private Node root; public tree(){
    root = null;
    }
    
    public tree(Node root){ this.root = root;
    }
    
    public tree(String data){ this.root = new Node(data);
    }
    public void insert(String data){ insert(new Node(data));
    }
    
    public void insert(Node child){ insert(root, child);
    }
    
    public void insert(Node parent, Node child){ if(root == null) {
    root = child;
    
        System.out.println("Add " + child.getData() + " asRoot");
     
    }

        else{
        if(child.isGreater(parent)){ if(parent.getRightChild() == null) {
        parent.setRightChild(child); System.out.println("Add " + child.getData() +
     
            " RightChild " + parent.getData());
            }
            else insert(parent.getRightChild(), child);
        }
        
        else { 
        if(parent.getLeftChild() == null) { parent.setLeftChild(child); System.out.println("Add " + child.getData() +
        " LeftChild " + parent.getData());
        }
        else insert(parent.getLeftChild(), child);
        }
        }
    }
    public static void main(String[] args) { tree pohon = new tree();
    // String data = "HAKCBDJL";
    Scanner input = new Scanner(System.in); System.out.print("String : ");
    String data = input.nextLine();
    for(int	i=0;	i<data.length();i++) 
    pohon.insert(String.valueOf(data.charAt(i)));
    }

    }
    