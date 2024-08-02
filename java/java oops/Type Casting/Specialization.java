class Superb{
    void dispy(){
        System.out.println("superrrr");
    }
    }
    class Subby1 extends Superb{
        void dispy(){
            System.out.println("subbbb1");
        }
    }
    class Subby2 extends Superb{
        void dispy(){
            System.out.println("subbbb2");
        }
    }
    public class Specialization {
        public static void main(String[] args) {
            Superb s = new Subby1();
            s.dispy();
            Superb s2 = new Subby2();
            s2.dispy();
        }
    }
    