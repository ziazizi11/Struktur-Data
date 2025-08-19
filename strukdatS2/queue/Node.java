import java.util.Scanner;

public class Node { private String data;
    private Node LeftChild; private Node RightChild; private Node parent;
    public String getData() { return data;
    }
    public void setData(String data) { this.data = data;
    }
    public Node getLeftChild() { return LeftChild;
    }
    public void setLeftChild(Node LeftChild) { this.LeftChild = LeftChild;
    }
    public Node getRightChild() { return RightChild;
    }
    public void setRightChild(Node RightChild) { this.RightChild = RightChild;
    }
    public Node (String data){ this.data = data; LeftChild = null; RightChild = null;
    }
    public boolean isGreater(Node compare){
    return this.data.compareTo(compare.getData()) > 0;
    }
 
    }
    