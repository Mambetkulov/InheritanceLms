
public class Dancer extends Person{
      String GroupName;

     public Dancer(String name ,String designation ,String GroupName){
         this.name = name;
         this.designation = designation;
         this.GroupName = GroupName;
     }

    @Override
    public String toString() {
        return "name : " + name + "\n" + "designation : " + designation
                + '\n' + "Group name : " + GroupName + "\n" + name + " can learn \n" +
                name + " can walk \n" + name + " can eat \n" + name + " can dance ";
    }

}
