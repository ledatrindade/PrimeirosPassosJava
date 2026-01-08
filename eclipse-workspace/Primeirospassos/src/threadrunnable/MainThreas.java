package threadrunnable;

public class MainThreas {
	
	public static void main(String[] args) {

        MinhaThread t3 = new MinhaThread();
        
        t3.start(); // começa a thread
        
        Tarefa tarefa = new Tarefa();

        Thread thread = new Thread(tarefa);
        thread.start();
        

        Contador c1 = new Contador("Thread A");
        Contador c2 = new Contador("Thread B");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }

}
