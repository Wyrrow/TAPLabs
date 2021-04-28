package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Word
{
    String SomeWord;

    public Word() throws IOException {
        enterWord();
    }

    public Word(String w)
    {
        enterWord(w);
    }


   /* Word() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);
        System.out.println("\nYou want to draw line?(yes/no) ");
        String choice = bis.readLine();
        if (!choice.equals("yes")) {
            enterWord();
        }
        else
            enterWord("line");
    }*/



    String enterWord() throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);

        System.out.println("\nEnter your command: ");
        SomeWord = bis.readLine();

        return SomeWord;
    }

    String enterWord(String w) {

        SomeWord = w ;
        return SomeWord;
    }

    boolean decision()
    {
        if (!SomeWord.equals("line")) {
            return false;
        } else {
            return true;
        }
    }


}

class Line extends Word
{


    public Line(String line) throws IOException {
        super(line);
    }

    public Line() throws IOException {
        super();

    }

    public String choice() throws IOException {

        boolean t = decision();

        if(t == true)
        {
            System.out.println("\nwhich line do you want to draw? (straight / wavy / jagged)");

            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader bis = new BufferedReader(is);

            String choice = bis.readLine();
            return choice;
        }
        else
        {
            System.out.println("\nThe command is wrong");
            String wrong ="404";
            return wrong;
        }
    }



    void allProgram() throws IOException {
      String command = choice();
        if (!command.equals("straight")) {
            if(command.equals("wavy"))
            {
                drawing(1);
            }
            else if (command.equals("jagged"))
            {
                drawing((float) 0.1);
            }
            else
            {
                System.out.println(command);
            }
        } else {
            drawing();
        }

    }

    void drawing()
    {
        System.out.println("\nYour line: --------------------------------------------");
    }

    void drawing(int tmp)
    {
        System.out.println("\nYour line: - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    void drawing(float tmp)
    {
        System.out.println("\nYour line: ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }



}

public class Main {

    public static void main(String[] args) throws IOException {

        String t ="" ;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);


        Line l1 = new Line("line");
        Line l2 = new Line();
        l1.allProgram();
        l2.allProgram();

    }
}
