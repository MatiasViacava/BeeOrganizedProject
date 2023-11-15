package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class QueryActividadMAX {
    private LocalDate dateActivity;
    private int maxActivity;

    public LocalDate getDateActivity() {
        return dateActivity;
    }

    public void setDateActivity(LocalDate dateActivity) {
        this.dateActivity = dateActivity;
    }

    public int getMaxActivity() {
        return maxActivity;
    }

    public void setMaxActivity(int maxActivity) {
        this.maxActivity = maxActivity;
    }
}

