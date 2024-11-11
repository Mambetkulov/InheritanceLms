public class Programmer extends Person {
    String CompanyName;

    public Programmer(String name , String designation , String CompanyName){
        this.name = name;
        this.designation = designation;
        this.CompanyName = CompanyName;
    }

    @Override
    public String toString() {
        return "name : " + name + "\n" + "designation : " + designation
                +  "\n" + "Company name : " + CompanyName +"\n" +
                name + " can learn \n" + name + " can walk \n" +
                name + " can eat \n" + name + " can code ";
        }


}



