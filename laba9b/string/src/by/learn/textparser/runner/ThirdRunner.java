package by.learn.textparser.runner;

import by.learn.textparser.components.Text;
import by.learn.textparser.utils.Reader;

import static by.learn.textparser.utils.Parser.maxSequence;

public class ThirdRunner {
    public static void main(String[] args) {
        String path = "F:\\Java\\laba9b\\string\\test3.txt";
        Text text = new Text(Reader.fromFile(path));

        maxSequence(text);
    }
}
