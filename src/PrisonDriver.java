public class PrisonDriver {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Cell objects
        Cell cell1=new Cell("A1","1234");
        Cell cell2=new Cell("B1","5678");
        Cell cell3=new Cell("C1","9123");
        Cell cell4=new Cell("D1",true,"4567");


        //Prisoner pris1=new Prisoner("BOB",1.56,7,cell1);
        // Prisoner pris2=new Prisoner("Jane Gunn",1.45,5,cell2);
        Prisoner pris3=new Prisoner(cell4 );


        // pris1.openCell();
        // pris2.openCell();
        pris3.openCell();
        // pris1.think();
        // pris1.think("They will never know everything I have done.");

        // System.out.println(pris1.toString());
        // System.out.println(pris2.toString());
        System.out.println(pris3.toString());

        System.out.println(cell1);
        System.out.println(cell2);
        System.out.println(cell3);
        System.out.println(cell4);
    }//end main

}//end class PisonDriver


