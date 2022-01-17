import fr.inssurance.InssuranceReader;
import fr.patient.Patient;
import fr.patient.PatientReader;

import java.io.IOException;
import java.text.ParseException;

public class TestMVN2 {
    public static void main(String[] args) throws IOException, ParseException {
        PatientReader pR = new PatientReader();
        InssuranceReader iS = new InssuranceReader();
        //displaying rhe patients and inssurance
        pR.readAll();
        iS.readAll();
    }
}
