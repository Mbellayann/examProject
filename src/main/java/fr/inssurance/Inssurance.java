package fr.inssurance;

public class Inssurance {
    private Integer insurance_id;
    private String insurance_name;

    public Integer getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(Integer insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getInsurance_name() {
        return insurance_name;
    }

    public void setInsurance_name(String insurance_name) {
        this.insurance_name = insurance_name;
    }

    @Override
    public String toString() {
        return "Inssurance{" +
                "insurance_id=" + insurance_id +
                ", insurance_name='" + insurance_name + '\'' +
                '}';
    }
}
