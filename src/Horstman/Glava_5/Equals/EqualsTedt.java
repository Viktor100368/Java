package Horstman.Glava_5.Equals;



/**
 * В этой программе демонстрируется примениение метода equals()
 * @version 1.12
 * @author Cay Horstman
 */


public class EqualsTedt {
    public static void main(String[] args){
        Employe alise1 = new Employe("Alise Adams",75000,1987,12,15);
        Employe alise2= alise1;
        Employe alise3=new Employe("Alise Adams",75000,1987,12,15);
        Employe bob = new Employe("Bob Brandson",50000,1989,10,1);
        System.out.println("alise1==alise2: "+(alise1==alise2));
        System.out.println("alise1==alise3: "+(alise1==alise3));
        System.out.println("alise1.equals(alise3): "+
                alise1.equals(alise3));
        System.out.println("alise1.equals(bob): "+alise1.equals(bob));
        System.out.println("bob.toString(): "+bob);
        Manager carl=new Manager("Carl Cracker",80000,1987,12,15);
        Manager boss= new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(5000);
        System.out.println("boss.toString(): "+ boss);
        System.out.println("carl.equals(boss): "+carl.equals(boss));
        System.out.println("alise1.hashCode(): "+alise1.hashCode());
        System.out.println("alise3.hashCode(): "+alise3.hashCode());
        System.out.println("bob.hashCode(): "+bob.hashCode());
        System.out.println("carl.hashCode(): "+carl.hashCode());
    }
}
