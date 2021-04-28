package com.company;

import java.util.Scanner;


class Word {
    String text;
    int countOfCharacters;

    public Word() {
    }

    public Word(String _text) {
        text = _text;
    }

    public void printText() {
        System.out.println(text);
    }

    public void printCountOfCharacters() {
        countAllCharacters();

        System.out.println("Count of all characters: " + String.valueOf(countOfCharacters));
    }

    public void enterText() {
        System.out.print("Enter the word: ");
        Scanner scan = new Scanner(System.in);
        String _text = scan.next();
        text = _text;
    }

    protected void countAllCharacters() {
        int tmp = 0;
        char[] textToChar = text.toCharArray();

        for (int i = 0; i < textToChar.length; i++) {
            tmp++;
        }
        countOfCharacters = tmp;
    }


}

class Line extends Word {
    int countOfSpaces;
    int countOfSymbols;

    public Line() {
    }

    public Line(String _text) {
        super();
    }

    public void enterText() {
        System.out.println("Enter the line: ");
        Scanner scan = new Scanner(System.in);
        String _text = scan.nextLine();
        text = _text;
    }

    @Override
    public void printText() {
        System.out.print("Our line is: ");
        super.printText();
    }

    @Override
    public void printCountOfCharacters() {
        super.printCountOfCharacters();
        System.out.println("Count of symbols: " + String.valueOf(countOfSymbols));
        System.out.println("Count of spaces: " + String.valueOf(countOfSpaces));
    }

    @Override
    protected void countAllCharacters() {
        super.countAllCharacters();

        int _spaces = 0;
        char[] textToChar = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (textToChar[i] == ' ') {
                _spaces++;
            }
        }

        countOfSpaces = _spaces;
        countOfSymbols = countOfCharacters - countOfSpaces;
    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("WORD:\n");
        Word w1 = new Word();
        w1.enterText();
        w1.printText();
        w1.printCountOfCharacters();

        System.out.println("\n\nLINE:\n");
        Line l1 = new Line();
        l1.enterText();
        l1.printText();
        l1.printCountOfCharacters();
    }
}

