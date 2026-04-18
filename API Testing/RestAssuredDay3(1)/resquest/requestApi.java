package resquest;

public class requestApi {

    private String drilldowns;
    private String measures;
    private String year;
    private String state;

    public String getDrilldowns() {
        return drilldowns;
    }

    public void setDrilldowns(String drilldowns) {
        this.drilldowns = drilldowns;
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
