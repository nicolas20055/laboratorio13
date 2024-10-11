package laboratorioPOO13;

public class Main {

    Arrow arrow1, arrow2, arrow3;

    public static void main(String[] args) {
        Main myMain = new Main();
    }

    public Main() {
        // Primera flecha con valores por defecto
        arrow1 = new Arrow();
        arrow1.buildArrow();
        arrow1.printSpace();

        // Segunda flecha con longitud y color modificados
        arrow2 = new Arrow();
        arrow2.length = 34;
        arrow2.color = "red";
        arrow2.buildArrow();
        arrow2.printSpace();

        // Tercera flecha creada usando el constructor parametrizado
        arrow3 = new Arrow(12, "black");
        arrow3.buildArrow();
        arrow3.printSpace();
    }
}
