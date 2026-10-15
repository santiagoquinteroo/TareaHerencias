package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.EnvioExpres;
import co.edu.uniquindio.poo.model.EnvioInternacional;
import co.edu.uniquindio.poo.model.EnvioNacional;
import co.edu.uniquindio.poo.model.Envío;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        Envío nacional = new EnvioNacional("N1204", "Federico",42.5, "Armenia", true);
        Envío internacional = new EnvioInternacional("I2711","Francisco",21.4,"Chile", true);
        Envío expres = new EnvioExpres("E2405","Ernesto",15.6,"Armenia",true,22);



    }
}
