package carcare;


public class Warranty  extends Maintenance {


                                              // ******************  Attributes  ******************
    private  int year ;
    private  String Start_Date_Warranty ;
    private  String End_Date_Warranty ;
    private String owner_Address;


                                             //    constructors   ***********************


    Warranty(){
        Terms_of_warrant();
    }


    Warranty(int year , String Start_Date_Warranty , String End_Date_Warranty  , String owner_Address , String model,  String OwnerName , String color )
    {

        this.year= year;
        this.Start_Date_Warranty= Start_Date_Warranty;
        this.End_Date_Warranty=End_Date_Warranty;
        this.owner_Address=owner_Address;
        setOwn_Name(OwnerName) ;
        setModel(model);
        setColor(color);
        


        Terms_of_warrant();        /// print Terms_of_warrant

    }

    void Terms_of_warrant(){

        System.out.println("1- If one of its maintenance is forgotten, guarantee the motor, chassis, pedals, and main parts\n" +
                "2 - If two consecutive maintenance or intermittent loss of the whole warranty\n" +
                "3-If the oil changes and filters follow the warranty\n" +
                "4 - oil of the fuse as well\n" +
                "5. Cooling water as well\n" +
                "6. Belt set as well");
    }



    //  method's Get and Set

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStart_Date_Warranty() {
        return Start_Date_Warranty;
    }

    public void setStart_Date_Warranty(String start_Date_Warranty) {
        Start_Date_Warranty = start_Date_Warranty;
    }

    public String getEnd_Date_Warranty() {
        return End_Date_Warranty;
    }

    public void setEnd_Date_Warranty(String end_Date_Warranty) {
        End_Date_Warranty = end_Date_Warranty;
    }

    public String getOwner_Address() {
		return owner_Address;
	}


	public void setOwner_Address(String owner_Address) {
		this.owner_Address = owner_Address;
	}


	// toString to print data
    public String toString() {
        return "Warranty{" +
                "year=" + getYear() +
                ", Start_Date_Warranty='" + getStart_Date_Warranty() + '\'' +
                ", End_Date_Warranty='" + getEnd_Date_Warranty() + '\'' +
                '}';
    }
}
