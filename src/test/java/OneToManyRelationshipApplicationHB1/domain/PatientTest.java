package OneToManyRelationshipApplicationHB1.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PatientTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Patient}
     *   <li>{@link Patient#setAppoinments(List)}
     *   <li>{@link Patient#setPatient_No(int)}
     *   <li>{@link Patient#setPatient_age(int)}
     *   <li>{@link Patient#setPatient_name(String)}
     *   <li>{@link Patient#getAppoinments()}
     *   <li>{@link Patient#getPatient_No()}
     *   <li>{@link Patient#getPatient_age()}
     *   <li>{@link Patient#getPatient_name()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Patient actualPatient = new Patient();
        ArrayList<Appoinment> appoinments = new ArrayList<>();
        actualPatient.setAppoinments(appoinments);
        actualPatient.setPatient_No(1);
        actualPatient.setPatient_age(1);
        actualPatient.setPatient_name("Patient name");
        assertSame(appoinments, actualPatient.getAppoinments());
        assertEquals(1, actualPatient.getPatient_No());
        assertEquals(1, actualPatient.getPatient_age());
        assertEquals("Patient name", actualPatient.getPatient_name());
    }
}

