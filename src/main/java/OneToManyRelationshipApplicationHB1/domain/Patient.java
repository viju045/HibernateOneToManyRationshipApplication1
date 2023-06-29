package OneToManyRelationshipApplicationHB1.domain;

import jakarta.persistence.*;

import java.io.Serializable;

import java.util.List;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int patient_No;
    private String patient_name;
    private int patient_age;
    @OneToMany
    @JoinColumn(name="patient_No")
    private List<Appoinment>appoinments;

    public int getPatient_No() {
        return patient_No;
    }

    public void setPatient_No(int patient_No) {
        this.patient_No = patient_No;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public int getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(int patient_age) {
        this.patient_age = patient_age;
    }

    public List<Appoinment> getAppoinments() {
        return appoinments;
    }

    public void setAppoinments(List<Appoinment> appoinments) {
        this.appoinments = appoinments;
    }
}
