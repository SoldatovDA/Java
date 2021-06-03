package by.learn.textparser.components;

import java.util.List;
import java.util.Objects;

public class Symbol {
    private char symbol;

    public Symbol (char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + " ";
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Symbol symbol1 = (Symbol) o;
        return symbol == symbol1.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash (symbol);
    }
}
