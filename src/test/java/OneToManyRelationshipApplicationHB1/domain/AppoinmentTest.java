package OneToManyRelationshipApplicationHB1.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AppoinmentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Appoinment}
     *   <li>{@link Appoinment#setAppoinment_Date(String)}
     *   <li>{@link Appoinment#setAppoinment_No(int)}
     *   <li>{@link Appoinment#setAppoinment_Time(String)}
     *   <li>{@link Appoinment#setDoctor_Name(String)}
     *   <li>{@link Appoinment#setPatient(Patient)}
     *   <li>{@link Appoinment#getAppoinment_Date()}
     *   <li>{@link Appoinment#getAppoinment_No()}
     *   <li>{@link Appoinment#getAppoinment_Time()}
     *   <li>{@link Appoinment#getDoctor_Name()}
     *   <li>{@link Appoinment#getPatient()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Appoinment actualAppoinment = new Appoinment();
        actualAppoinment.setAppoinment_Date("2020-03-01");
        actualAppoinment.setAppoinment_No(1);
        actualAppoinment.setAppoinment_Time("Appoinment Time");
        actualAppoinment.setDoctor_Name("Doctor Name");
        Patient patient = new Patient();
        patient.setAppoinments(new ArrayList<>());
        patient.setPatient_No(1);
        patient.setPatient_age(1);
        patient.setPatient_name("Patient name");
        actualAppoinment.setPatient(patient);
        assertEquals("2020-03-01", actualAppoinment.getAppoinment_Date());
        assertEquals(1, actualAppoinment.getAppoinment_No());
        assertEquals("Appoinment Time", actualAppoinment.getAppoinment_Time());
        assertEquals("Doctor Name", actualAppoinment.getDoctor_Name());
        assertSame(patient, actualAppoinment.getPatient());
    }
}

