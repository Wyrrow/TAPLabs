package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Text
{
    String sText;
    String[] arrText;

    public Text (String text)
    {
        sText =text;
    }

    public void division()
    {
        arrText  = sText.split(" ");
        //String[] splitted = "car jeep scooter".split(" ");
    }

    public void changeCharacter(int index, char symbol)
    {
        index--;


        for (int i =0; i < arrText.length; i++ )
        {
            if(arrText[i].length()>index)
            {
                char[] destroyedWord = arrText[i].toCharArray();
                destroyedWord[index] = symbol;
                arrText[i] = new String(destroyedWord);
            }
        }
        buildString();
    }
    private void buildString()
    {
        sText = "";
        for (String word:arrText)
        {
            sText = sText.concat(word + " ");
        }

    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        String enterText;
        char letter;

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);

        System.out.println("\nEnter your text: ");
        enterText = bis.readLine();

        System.out.println("\nEnter your letter: ");
        letter = bis.readLine().charAt(0);

        System.out.println("\nEnter index to change: ");
        int index = Integer.parseInt(bis.readLine());

        Text firstText = new Text(enterText);

        System.out.println("Pervonachalinii TEXT: "+ firstText.sText);

        firstText.division();
        firstText.changeCharacter(index, letter);

        System.out.println("\n\nIzmenennii TEXT:\n"+ firstText.sText);

    }
}
