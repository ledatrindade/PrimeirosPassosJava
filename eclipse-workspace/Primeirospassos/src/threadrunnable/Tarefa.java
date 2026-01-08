package threadrunnable;

public class Tarefa implements Runnable {

    @Override
    public void run() {
        System.out.println("Executando tarefa em outra thread!");
    }
}
