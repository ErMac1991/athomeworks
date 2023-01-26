package Animals;

public enum HealthState {
    HEALTHY ("Здоров"),
    UNHEALTHY ("Болен");

    String healthStat;

    HealthState (String healthStat){
        this.healthStat = healthStat;
    }
}
