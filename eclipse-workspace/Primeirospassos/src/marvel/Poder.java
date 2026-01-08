package marvel;

public interface Poder {

    // REGRA: todo herói precisa usar um poder
    void usarPoder();

    // MÉTODO DEFAULT (opcional)
    default void recarregar() {
        System.out.println("🔋 Poder recarregando...");
    }

    // MÉTODO STATIC
    static void aviso() {
        System.out.println("⚠️ Use seus poderes com responsabilidade!");
    }
}
