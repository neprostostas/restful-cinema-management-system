package com.cinema.lab2.Data;
import com.cinema.lab2.Classes.Hall;
import java.util.ArrayList;
import java.util.List;
/**
 * This class represents a list of halls.
 * It contains a static final list of halls initialized in the constructor.
 */
public class HallList {
    // A static final list of halls
    public static final List<Hall> HALLS = new ArrayList<>(){{
        // Initializing the halls
        add(new Hall("Madison Square Garden", 18117));
        add(new Hall("Staples Center", 19068));
        add(new Hall("Barclays Center", 17732));
        add(new Hall("United Center", 23500));
        add(new Hall("TD Garden", 19580));
        add(new Hall("Smoothie King Center", 17579));
        add(new Hall("American Airlines Center", 19200));
        add(new Hall("Wells Fargo Center", 21000));
        add(new Hall("Amway Center", 18846));
        add(new Hall("Oracle Arena", 19596));
        add(new Hall("Bridgestone Arena", 19712));
        add(new Hall("Little Caesars Arena", 20491));
        add(new Hall("PNC Arena", 18680));
        add(new Hall("Capital One Arena", 20173));
        add(new Hall("Xcel Energy Center", 17954));
        add(new Hall("PPG Paints Arena", 19661));
        add(new Hall("KeyBank Center", 19844));
        add(new Hall("Scottrade Center", 19150));
        add(new Hall("SAP Center at San Jose", 17762));
        add(new Hall("Wells Fargo Arena", 17276));
        add(new Hall("The Forum", 17717));
        add(new Hall("BB&T Center", 19250));
        add(new Hall("Spectrum Center", 19504));
        add(new Hall("BMO Harris Bradley Center", 17686));
        add(new Hall("Prudential Center", 16500));
        add(new Hall("Nationwide Arena", 18500));
        add(new Hall("Quicken Loans Arena", 20562));
        add(new Hall("BMO Field", 30576));
        add(new Hall("M&T Bank Stadium", 71008));
        add(new Hall("MTS Centre", 15731));
        add(new Hall("Soldier Field", 61500));
        add(new Hall("Verizon Arena", 18000));
        add(new Hall("NRG Stadium", 71015));
        add(new Hall("CenturyLink Field", 72000));
        add(new Hall("AT&T Stadium", 105000));
        add(new Hall("Ford Field", 65000));
        add(new Hall("Mercedes-Benz Stadium", 83500));
        add(new Hall("Gillette Stadium", 66829));
        add(new Hall("MetLife Stadium", 82500));
        add(new Hall("Levi's Stadium", 68500));
    }};
}