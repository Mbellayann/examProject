package fr.patient;

import fr.inssurance.Inssurance;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public interface ReadInterface {
    public void  readAll() throws IOException, ParseException;
    public List<Patient> listPatient = new ArrayList<>();
}
