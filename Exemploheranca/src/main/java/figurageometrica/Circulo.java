
package figurageometrica;

import javax.swing.JOptionPane;


public class Circulo extends FiguraGeometrica {

    private double raio;

    public Circulo(double raio) {
        this("", 0);
    }

    public Circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void leitura() {
        super.leitura();
        setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "O raio é " + getRaio());
    }

    @Override
    public String paraString() {
        return (super.paraString() + "/ raio : " + getRaio());
    }

    public double getArea() {
        return (Math.PI * getRaio() * getRaio());
    }

}
