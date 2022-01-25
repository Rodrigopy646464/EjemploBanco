package es.studium.Tema5;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ejercicio5 {

	public static void main(String[] args) {



		{
			// Atributos o Componentes
			Frame ventana = new Frame("Veh�culos");

			Label lblMotorizacion = new Label("Tipo de motorizaci�n:");
			CheckboxGroup chkgMotorizacion = new CheckboxGroup();
			Checkbox chkGasolina = new Checkbox("Gasolina", false, chkgMotorizacion);
			Checkbox chkDiesel = new Checkbox("Di�sel", false, chkgMotorizacion);
			Checkbox chkHibrido = new Checkbox("H�brido", false, chkgMotorizacion);
			Checkbox chkElectrico = new Checkbox("El�ctrico", false, chkgMotorizacion);

			Label lblPuertas = new Label("N�mero de puertas:");
			CheckboxGroup chkgPuertas = new CheckboxGroup();
			Checkbox chkTres = new Checkbox("3", false, chkgPuertas);
			Checkbox chkCuatro = new Checkbox("4", false, chkgPuertas);
			Checkbox chkCinco = new Checkbox("5", false, chkgPuertas);

			Label lblPintura = new Label("Pintura metalizada:");
			CheckboxGroup chkgPintura = new CheckboxGroup();
			Checkbox chkMetalizada = new Checkbox("S�", false, chkgPintura);
			Checkbox chkNoMetalizada = new Checkbox("No", false, chkgPintura);

			Button btnCalcular = new Button("Calcular presupuesto");
			Panel pnlMotorizacion = new Panel();
			Panel pnlPuertas = new Panel();
			Panel pnlPintura = new Panel();
			Panel pnlBoton = new Panel();

			// Constructor
			
			{
				ventana.setLayout(new GridLayout(4,1));

				pnlMotorizacion.add(lblMotorizacion);
				pnlMotorizacion.add(chkGasolina);
				pnlMotorizacion.add(chkDiesel);
				pnlMotorizacion.add(chkHibrido);
				pnlMotorizacion.add(chkElectrico);
				ventana.add(pnlMotorizacion);

				pnlPuertas.add(lblPuertas);
				pnlPuertas.add(chkTres);
				pnlPuertas.add(chkCuatro);
				pnlPuertas.add(chkCinco);
				ventana.add(pnlPuertas);

				pnlPintura.add(lblPintura);
				pnlPintura.add(chkMetalizada);
				pnlPintura.add(chkNoMetalizada);
				ventana.add(pnlPintura);

				pnlBoton.add(btnCalcular);
				ventana.add(pnlBoton);

				ventana.setSize(500,170);
				ventana.setLocationRelativeTo(null);
				ventana.setVisible(true);
			}

		
			
		}



	}

}
