package fr.patient;

import fr.patient.ReadInterface;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PatientReader implements ReadInterface {
    @Override
    public void readAll() throws IOException, ParseException {
        List<String> lines = Files.readAllLines(Path.of("src/main/resources/patients.csv"));
        Patient pat = new Patient();
        String[] parts ;
        for(int i = 1; i<lines.size(); i++) {
            parts = lines.get(i).split(";");
            pat.setPat_num_HC(parts[0]);
            pat.setPat_lastname(parts[1]);
            pat.setPat_firstname(parts[2]);
            pat.setPat_address(parts[3]);
            pat.setPat_tel(parts[4]);
            Integer id = Integer.parseInt(parts[5]);
            pat.setPat_insurance_id(id);
            String date = parts[6];
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            pat.setPat_subscription_date(date1);
            listPatient.add(pat);
            pat = new Patient();
        }
        System.out.println(listPatient.toString());

    }
}
