

public class TransicionSimple implements TransicionHistoria{
    public void siguienteEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println(" Ahora debes ganar XP para mejorar tu fuerza");
        } else {
            System.out.println(" Ahora debes recolectar materiales para tu magia");
        }
    }
}
