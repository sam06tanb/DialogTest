import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("Welcome, %s, to Java programming!", name);

        JOptionPane.showMessageDialog(null, message);

        }
    }
