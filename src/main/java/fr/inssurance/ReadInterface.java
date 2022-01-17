package fr.inssurance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ReadInterface {
    public void  readAll() throws IOException;

    public List<Inssurance> listInsurance = new ArrayList<>();
}
