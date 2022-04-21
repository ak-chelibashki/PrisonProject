import javax.swing.*;
import java.util.Scanner;

public class Prisoner {

    /**
     * Class instances and variables
     */
    public Scanner in=new Scanner(System.in);
    //instance fields
    public String name="NA";
    public double height;
    public int years;
    public Cell cell;

    /**
     * Class constructor assigning values
     * to all instances
     * @param name
     * @param height
     * @param sentence
     * @param cell
     */
    public Prisoner(String name, double height, int sentence, Cell cell){
        this.name=name;
        this.height=height;
        years=sentence;
        this.cell=cell;
    }//end constructor


    //method overloading
    public Prisoner(Cell cell){
        this.cell=cell;
        this.name=setName();
        this.height=setHeight();
        this.years=setYears();
    }//end empty constructor

    /**
     * Method to display prisoner
     * message
     */
    public void think(){
        System.out.println(this.name+": I am innocent!");
        //JOptionPane.showMessageDialog(null,"I am innocent!","Prisoner",JOptionPane.INFORMATION_MESSAGE);
    }//end method think

    /**
     * Method to display what the prisoner thinks about
     * @param thought
     */
    public void think(String thought){
        System.out.println(this.name+": "+thought);
        //JOptionPane.showMessageDialog(null,"I am innocent!","Prisoner",JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Method to set
     * prisoner cell open
     */
    public void openCell(){
        if(cell.isIsOpen())
            System.out.println("Im going to escape");
        else
            cell.setIsOpen();
    }

    /**
     * Method to retrieve prisoner name
     * @return
     */
    public String getName()
    {
        return name;
    }//end

    /**
     * Method to retrieve prisoner height
     * @return
     */
    public double getHeight()
    {
        return height;
    }//end

    /**
     * Method to retrieve prisoner years
     * @return
     */
    public int getYears()
    {
        return years;
    }//end

    /**
     * Method to update prisoner name
     * validating user input
     * @return
     */
    public String setName( )
    {
        //how to catch integer input???
        String name=null;
        boolean check=false;

        do{
            name=JOptionPane.showInputDialog("Please enter Prisoner's name: ");
            //  check=Pattern.matches("\\D*",name);

            char[] chars=name.toCharArray();
            for(char c : chars){
                if(Character.isDigit(c)){
                    JOptionPane.showMessageDialog(null,"Invalid input");
                    check=false;
                }
                else if(Character.isDigit(c)==false){
                }
            }//end for

        }while(check==true);

        return name;
    }//end method

    /**
     * Overloaded method
     * to update prisoner name
     * @param name
     */
    public void setName(String name)
    {
        this.name=name;
    }//end

    /**
     * Method to update prisoner sentence years
     * implements gui and input validation
     * @return
     */
    public int setYears(){
        int years=0;
        do{
            String sYears=JOptionPane.showInputDialog("Please enter Prisoner's years of sentence : ");
            try{
                years=Integer.parseInt(sYears);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
        }while(years==0);

        return years;
    }//end method

    /**
     * Overloaded method to update prisoner years
     * @param years
     */
    public void setYears(int years){
        this.years=years;
    }

    /**
     * Method to update prisoner height
     * @param height
     */
    public void setHeight(double height){
        this.height=height;
    }//end

    /**
     * Method to update prisoner height
     * implementing input validation and gui
     * @return
     */
    public double setHeight(){
        double height=0;

        do{
            String sHeight=JOptionPane.showInputDialog("Please enter prisoner's Height: ");
            try{
                height=Double.parseDouble(sHeight);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
        }while(height==0);

        return height;
    }//end



    @Override
    public String toString(){
        return "Prisoner's name\t: "+this.name+
                "\nPrisoner's height\t: "+this.height
                +"\nPrisoner's sentence: "+this.years;

    }//end toString method
}
