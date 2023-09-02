package FACTORYCreaciónWidgeInterfazGráfica;

class Panel implements Widget {

    @Override
    public void dibujar() {
        System.out.println("Dibujando un panel.");
    }

    @Override
    public void clic() {
        System.out.println("Haciendo clic en un panel.");

    }
}
