package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class QueryActividadMAX {
    private LocalDate DateActivity;
    private int maxActivity;

    public LocalDate getDateActivity() {
        return DateActivity;
    }

    public void setDateActivity(LocalDate dateActivity) {
        DateActivity = dateActivity;
    }

    public int getMaxActivity() {
        return maxActivity;
    }

    public void setMaxActivity(int maxActivity) {
        this.maxActivity = maxActivity;
    }
}

