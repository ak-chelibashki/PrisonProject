public class Cell {

    /**
     * Class instances
     */
    private final String KEYCODE;
    private String name;
    private boolean isOpen;

    /**
     * Class constructor
     * @param name
     * @param isOpen
     * @param keycode
     */
    public Cell(String name, boolean isOpen, String keycode)
    {
        this.name=name;
        this.isOpen=isOpen;
        this.KEYCODE=keycode;
    }//end constructor

    /**
     * Class constructor
     * @param name
     * @param code
     */
    public Cell(String name, String code)
    {
        this(name,false,code);
    }//end constructor

    /**
     * Method to retrieve guard key code for cell
     * @param guardsCode
     * @return
     */
    public String getKeycode(String guardsCode){
        if(guardsCode.equals("9999")){
            return KEYCODE;
        }
        else
            return "0000";
    }//end method getKeyword

    /**
     * Method to retrieve cell name
     * @return
     */
    public String getName(){
        return name;
    }//end method getName

    /**
     * Method to update cell name
     * @param name
     */
    public void setName( String name){
        this.name=name;
    }//end method setName

    /**
     * Method to retrieve cell status
     * @return
     */
    public boolean isIsOpen(){
        return isOpen;
    }//end method isOpen

    /**
     * Method to attempt to open the cell
     */
    public void setIsOpen(){
        System.out.println("Cell"+this.name+" cannot be opened withoud a code");
    }//end method setIsOpen

    /**
     * Overriden method to set
     * cell to open
     * The method checks if the keycode is valid
     * @param code
     */
    public void setIsOpen(String code){
        if(!code.equals(KEYCODE)){
            System.out.println("The code provided is incorrect: "+code);
        }
        else if(code.equals(KEYCODE) && isOpen==true){
            isOpen=false;
            System.out.println("\nCell number: "+this.name+"\nCell Status: Closed "+this.isOpen);
        }
        else if(code.equals(KEYCODE)&& isOpen==false){
            isOpen=true;
            System.out.println("\nCell number: "+this.name+"\nCell Status:Open "+this.isOpen);
        }
    }//end method

    @Override
    public String toString(){
        return "\nCell number: "+this.name+"\nCell Status: "+this.isOpen;
    }//end method toString
}
