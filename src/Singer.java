public class Singer extends Person{
     String BandName;

    public Singer (String name , String designation , String BandName){
        this.name = name;
        this.designation = designation;
        this.BandName = BandName;
    }

    @Override
    public String toString() {
        return "name : " + name +"\n" + "disignation : " + designation
                + "\n" + "Band name : " + BandName + "\n" +  name + " can learn \n"
                + name + " can walk \n" + name + " can eat \n" + name + " can sing ";
    }

}
