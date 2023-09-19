package pe.edu.upc.aaw.beeorganizedproject.dtos;

import java.time.LocalDate;

public class QueryActividadMAX {
    public LocalDate QueryNameTest;
    public int QueryMaxTest;

    public LocalDate getQueryNameTest() {
        return QueryNameTest;
    }

    public void setQueryNameTest(LocalDate queryNameTest) {
        QueryNameTest = queryNameTest;
    }

    public int getQueryMaxTest() {
        return QueryMaxTest;
    }

    public void setQueryMaxTest(int queryMaxTest) {
        QueryMaxTest = queryMaxTest;
    }
}

