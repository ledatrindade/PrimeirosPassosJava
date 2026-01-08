package threadrunnable;

public class Contador implements Runnable {

    private String nome;

    public Contador(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 11; i++) {
            System.out.println(nome + " contando: " + i);

            try {
                Thread.sleep(500); // pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
