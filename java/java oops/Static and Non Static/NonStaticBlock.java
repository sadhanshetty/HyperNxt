public class NonStaticBlock {
    String name;
    
    {
        name = "sadhan";
    }

    public static void main(String[] args) {
        NonStaticBlock n = new NonStaticBlock();
        System.out.println("Name: " + n.name);
    }
}
