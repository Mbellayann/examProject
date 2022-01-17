package fr.inssurance;


import java.io.FileNotFoundException;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InssuranceReader implements ReadInterface {
    @Override
    public void readAll() throws IOException {
        String fileName = "src/main/resources/insurances.csv";
        List<String> lines = Files.readAllLines(new File(fileName).toPath());
        Inssurance ins = new Inssurance();
        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i).split(";");
            Integer t = Integer.parseInt(parts[0]);
            ins.setInsurance_id(t);
            ins.setInsurance_name(parts[1]);
            listInsurance.add(ins);
            ins = new Inssurance();
        }
        System.out.println(listInsurance);

    }
}
