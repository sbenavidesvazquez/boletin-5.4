package boletin.pkg5.pkg4;

public class PolboConPatacas {

    int polbo;
    int patacas;

    public PolboConPatacas() {
        polbo = patacas = 0;
    }

    public PolboConPatacas(int po, int pa) {
        po = polbo;
        pa = patacas;
    }
    public int getPolbo(){
        return polbo;
    }
    public int getpatacas(){
        return patacas;
    }

    public void engadirPolbo(int x) {
        polbo = polbo + x;
    }

    public void engadirPatacas(int x) {
        patacas = patacas + x;
        
    }

    public void amosarPolbo() {
        
        System.out.println("polbo= "+polbo);
    }

    public void amosarPatacas() {
       
        System.out.println("patacas= "+patacas);
    }
    public void numeroClientes(){
        System.out.println("numero de clientes= "+ 3*polbo*patacas/2);
    }
}
