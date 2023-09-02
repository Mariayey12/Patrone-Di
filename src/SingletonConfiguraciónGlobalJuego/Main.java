package SingletonConfiguraciónGlobalJuego;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de GameConfiguration
        GameConfiguration gameConfig = GameConfiguration.getInstance();

        // Acceder y configurar la dificultad
        gameConfig.setDifficulty(2);
        int currentDifficulty = gameConfig.getDifficulty();
        System.out.println("Dificultad actual: " + currentDifficulty);

        // Acceder y configurar el volumen de sonido
        gameConfig.setSoundVolume(0.7);
        double currentSoundVolume = gameConfig.getSoundVolume();
        System.out.println("Volumen de sonido actual: " + currentSoundVolume);

        // Acceder y configurar las opciones gráficas
        gameConfig.setGraphicsOptions("High");
        String currentGraphicsOptions = gameConfig.getGraphicsOptions();
        System.out.println("Opciones gráficas actuales: " + currentGraphicsOptions);
    }
}

