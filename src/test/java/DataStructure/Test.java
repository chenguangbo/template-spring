package DataStructure;

public class Test {


    public static void main(String[] args) {
        LinkNode<Integer> node = new LinkNode<>();
        System.out.println(node.getSize());
        node.add(1);
        System.out.println(node.getSize());
        node.add(2);
        System.out.println(node.getSize());
        node.add(3);
        System.out.println(node.toString());
        System.out.println(node.getSize());
    }

}
