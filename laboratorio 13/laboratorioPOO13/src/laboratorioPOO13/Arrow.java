package laboratorioPOO13;

public class Arrow {
    int length;
    String color;

    // Constructor por defecto
    public Arrow() {
        length = 18;
        color = "black";
    }

    // Constructor con parámetros
    public Arrow(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public void printSpace() {
        System.out.println();
    }

    public void buildArrow() {
        for (int i = 0; i < length; i++) {
            printSymbol("-");
        }
        printSymbol(">");
    }

    private void printSymbol(String symbol) {
        if (color.equals("black")) {
            System.out.print(symbol);
        } else {
            System.err.print(symbol);
        }
    }
}

