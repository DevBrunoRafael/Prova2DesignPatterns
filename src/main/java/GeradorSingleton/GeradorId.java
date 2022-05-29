package GeradorSingleton;

import java.util.Random;

public class GeradorId {

    // Singleton =======================================================================================================
    private static GeradorId instance;
    private GeradorId(){
    }
    public static GeradorId getInstance() {
        if (instance == null)
            instance = new GeradorId();
        return instance;
    }
    // =================================================================================================================

    public int gerarId() {

        StringBuilder text = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            text.append(random.nextInt(10));
        }

        return Integer.parseInt(text.toString());
    }

}
