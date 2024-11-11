public class Person {
     String name;
     String designation;

     public Person(){

     }

     public Person(String name , String designation){
         this.name = name;
         this.designation = designation;
     }

    @Override
    public String toString() {
        return "name : " + name + '\n' +
                "designation : " + designation + "\n" + name + " can learn \n"
                + name + " can walk " + name + " can eat ";
    }

}
