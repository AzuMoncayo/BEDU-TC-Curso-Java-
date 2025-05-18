public class MainNarrativo {
    public static void main(String[] args) {

        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple();

        dialogo.mostrarDialogo("Apareces dentro de un mundo mágico y debes decidir si entre fuerza física o magia");
        String eleccion = decision.tomarDecision();
        transicion.siguienteEscena(eleccion);

    }
}