import javax.swing.JOptionPane;
public class Problum9{
  public static void main(String[] args) {
    double weight;
    double height;
    double bodymass;
String input = JOptionPane.showInputDialog("Enter your weight in pounds");
weight = Double.parseDouble(input);
weight=weight*0.45359237;
 input = JOptionPane.showInputDialog("enter your height in inches");
height = Double.parseDouble(input);
height=height*0.0254;
bodymass=weight/height;
JOptionPane.showMessageDialog(null, "the body mass is" + bodymass);
  }
}




//BMI = kg/m2//