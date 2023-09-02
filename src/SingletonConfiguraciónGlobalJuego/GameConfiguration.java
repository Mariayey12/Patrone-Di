package SingletonConfiguraciónGlobalJuego;

public class GameConfiguration {
    private static GameConfiguration instance;

    private int difficulty;
    private double soundVolume;
    private String graphicsOptions;

    private GameConfiguration() {
        // Constructor privado para evitar la creación de instancias directamente.
        // Inicializa las propiedades con valores por defecto.
        difficulty = 1; // Dificultad predeterminada
        soundVolume = 0.5; // Volumen de sonido predeterminado
        graphicsOptions = "Medium"; // Opciones gráficas predeterminadas
    }

    // Método estático para obtener la única instancia de la clase (Singleton).
    public static GameConfiguration getInstance() {
        if (instance == null) {
            instance = new GameConfiguration();
        }
        return instance;
    }

    // Métodos públicos para establecer y obtener
    // los valores de dificultad, volumen de sonido y opciones gráficas.

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public double getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(double soundVolume) {
        this.soundVolume = soundVolume;
    }

    public String getGraphicsOptions() {
        return graphicsOptions;
    }

    public void setGraphicsOptions(String graphicsOptions) {
        this.graphicsOptions = graphicsOptions;
    }
}
