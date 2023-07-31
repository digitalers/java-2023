package src;

import java.util.ArrayList;

public class CarteraDeValores {
    private ArrayList<Valor> valores; // lista de valores asociados a la cartera

    public CarteraDeValores() {

    }

    public CarteraDeValores(ArrayList<Valor> valores) {
        this.valores = new ArrayList<>();
    }

    public ArrayList<Valor> getValores() {
        return valores;
    }

    public void setValores(Valor valor) {
        valores.add(valor);
    }

    @Override
    public String toString() {
        return "CarteraDeValores{" + "\n" +
                "valores=" + valores + "\n" +
                '}' + "\n";
    }
}
