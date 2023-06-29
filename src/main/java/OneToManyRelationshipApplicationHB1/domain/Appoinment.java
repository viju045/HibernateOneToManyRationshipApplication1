package OneToManyRelationshipApplicationHB1.domain;

import jakarta.persistence.*;

import java.io.Serializable;

//This is first OneToMany mapping relationship application.
@Entity
@Table(name ="Appointment")
public class Appoinment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int appoinment_No;
    private String appoinment_Date;
    private String appoinment_Time;
    private String doctor_Name;
    @ManyToOne
    @JoinColumn(name = "patient_No")
    private Patient patient;

    public int getAppoinment_No() {
        return appoinment_No;
    }

    public void setAppoinment_No(int appoinment_No) {
        this.appoinment_No = appoinment_No;
    }

    public String getAppoinment_Date() {
        return appoinment_Date;
    }

    public void setAppoinment_Date(String appoinment_Date) {
        this.appoinment_Date = appoinment_Date;
    }

    public String getAppoinment_Time() {
        return appoinment_Time;
    }

    public void setAppoinment_Time(String appoinment_Time) {
        this.appoinment_Time = appoinment_Time;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
