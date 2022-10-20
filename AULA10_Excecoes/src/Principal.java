import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        float num1;
        float num2;
        float result = 0;

try{
        num1 = Float.parseFloat(
                JOptionPane.showInputDialog("Primeiro numero?")
        );

        num2 = Float.parseFloat(
                JOptionPane.showInputDialog("Segundo numero?")
        );

        result = num1 / num2;

        JOptionPane.showMessageDialog(null, "Variavel de resultado" + result);


    }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Atencao, entre com um numero valido");
        }
    }
}
