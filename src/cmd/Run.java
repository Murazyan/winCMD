package cmd;

import java.io.PrintWriter;

public class Run {
    public static void main(String[] args) {
        runMyCommandInMyComputer("start calc");
//        runMyCommandInMyComputer("shutdown /r");

    }

    public static void runMyCommandInMyComputer(String myCommand) {
        String[] command = {"cmd"};
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println(myCommand);
            stdin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}