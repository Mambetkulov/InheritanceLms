//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person = new Person("aibek","worker");
        Programmer programmer = new Programmer("baiel","Programmer","Peaksoft");
        Dancer dancer = new Dancer("Nursultan", "Dancer","shaolin");
        Singer singer = new Singer("Baibolot","Singer","ak choro");

        Object[] arrays = new Object[] {person,programmer,dancer,singer};
         for(Object i : arrays){
             System.out.println( i.toString());
             System.out.println("😒😒😒😒😒😒😒😒😒😒😒😒😒");
         }


    }
}