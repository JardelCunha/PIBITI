package br.com.pibiti.qualdose;

import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Dipirona;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Ibuprofeno;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Nimesulida;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Paracetamol;
import android.view.Menu;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class InsereDadosActivity extends Activity {

	private static String[] listaMedicamentos = {
		"Selecione o medicamento...",
		"Dipirona",
		"Ibuprofeno",
		"Nimesulida",
		"Paracetamol" };

	ArrayAdapter<String> arrayMedicamentos;

	Spinner spinner;
	EditText resultado, editTextIdade, editTextPeso;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inseredados);

		// modelo do spinner
		arrayMedicamentos = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, listaMedicamentos);

		// capturando o editText do xml pela id
		resultado = (EditText) findViewById(R.id.resultadoEditText);

		Button botaoCalcular;
		botaoCalcular = (Button) findViewById(R.id.calcularButton);

		spinner = (Spinner) findViewById(R.id.listaMedicamentosSpinner);
		spinner.setAdapter(arrayMedicamentos);

		editTextIdade = (EditText) findViewById(R.id.idadeEditText);
		editTextPeso = (EditText) findViewById(R.id.pesoEditText);

		// listener do botão CALCULAR

		botaoCalcular.setOnClickListener(new View.OnClickListener() {
			String stringResultado = new String();
			
			AlertDialog.Builder dialogo = new AlertDialog.Builder(InsereDadosActivity.this);

			// capturando o spinner do xml pela id

			@Override
			public void onClick(View v) {
				try {
					if (spinner.getSelectedItem() != null) {
						switch (spinner.getSelectedItemPosition()) {
						case 0:
							SelecioneUmMedicamento();
							break;
						case 1:
							
							CalculaDipirona();
							break;
							
						case 2:
							
							CalculaIbuprofeno();
							break;

						case 3:
							
							CalculaNimesulida();
							break;

						case 4:
							
							CalculaParacetamol();
							break;

						default:
							break;

						}
					}

				} catch (Exception e) {
					dialogo.setTitle("Ops...");
					dialogo.setMessage("O programador não previu que isso"
							+ " pudesse acontecer :(");
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}

			}

			/*
			 * chama o método CalculaMin e CalculaMax de Paracetamol
			 * 
			 * Método que calcula a dosagem e retorna uma string com o texto da
			 * prescrição para o editText resultado
			 */

			private void SelecioneUmMedicamento() {
					dialogo.setTitle("Ops..");
					dialogo.setMessage("Você esqueceu de selecionar um medicamento!");
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
			}

			private void CalculaParacetamol() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());
				
				//criando um objeto do tipo paracetamol

				Paracetamol paracetamol = new Paracetamol();
				
				//invocando o método calculaDoseMax de paracetamol
				double dosagemMax = paracetamol.CalculaDoseMax(idade, peso);

				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */

				double dosagemMin = paracetamol.CalculaDoseMin(idade, peso);
				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				stringResultado = ("No máximo " + dosagemMax + "mg de "
						+ paracetamol.getIntervalo() + " em "
						+ paracetamol.getIntervalo() + " horas\n\n" +

						"No mínimo " + dosagemMin + " mg de "
						+ paracetamol.getIntervalo() + " em "
						+ paracetamol.getIntervalo() + " horas");
				//resultado.setText(stringResultado);
				
				if(stringResultado != null){
					dialogo.setTitle("Resultado");
					dialogo.setMessage(stringResultado);
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}else{
					dialogo.setTitle("Ops..");
					dialogo.setMessage("Algo deu errado!");
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}

			}

			/*
			 * chama o método CalculaMin e CalculaMax de Nimesulida
			 * 
			 * Método que calcula a dosagem e retorna uma string com o texto da
			 * prescrição para o editText resultado
			 */

			private void CalculaNimesulida() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());

				Nimesulida nimesulida = new Nimesulida();
				double dosagemMax = nimesulida.CalculaDoseMax(idade, peso);
				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				double dosagemMin = nimesulida.CalculaDoseMin(idade, peso);

				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				stringResultado = ("No máximo " + dosagemMax + "mg de "
						+ nimesulida.getIntervalo() + " em "
						+ nimesulida.getIntervalo() + " horas\n\n" +

						"No mínimo " + dosagemMin + " mg de "
						+ nimesulida.getIntervalo() + " em "
						+ nimesulida.getIntervalo() + " horas");
				//resultado.setText(stringResultado);
				
				if(stringResultado != null){
					dialogo.setTitle("Resultado");
					dialogo.setMessage(stringResultado);
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}else{
					dialogo.setTitle("Ops..");
					dialogo.setMessage("Algo deu errado!");
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}
			}

			/*
			 * chama o método CalculaMin e CalculaMax de Ibuprofeno
			 * 
			 * Método que calcula a dosagem e retorna uma string com o texto da
			 * prescrição para o editText resultado
			 */

			private void CalculaIbuprofeno() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());

				Ibuprofeno ibuprofeno = new Ibuprofeno();
				double dosagemMax = ibuprofeno.CalculaDoseMax(idade, peso);

				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				double dosagemMin = ibuprofeno.CalculaDoseMin(idade, peso);

				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				stringResultado = ("No máximo " + dosagemMax + "mg de "
						+ ibuprofeno.getIntervalo() + " em "
						+ ibuprofeno.getIntervalo() + " horas\n\n" +

						"No mínimo " + dosagemMin + " mg de "
						+ ibuprofeno.getIntervalo() + " em "
						+ ibuprofeno.getIntervalo() + " horas");
				//resultado.setText(stringResultado);
				
				if(stringResultado != null){
					dialogo.setTitle("Resultado");
					dialogo.setMessage(stringResultado);
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}else{
					dialogo.setTitle("Ops..");
					dialogo.setMessage("Algo deu errado!");
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}
			}

			/*
			 * chama o método CalculaMin e CalculaMax de Dipirona
			 * 
			 * Método que calcula a dosagem e retorna uma string com o texto da
			 * prescrição para o editText resultado
			 */

			private void CalculaDipirona() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());

				Dipirona dipirona = new Dipirona();
				double dosagemMax = dipirona.CalculaDoseMax(idade, peso);
				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				double dosagemMin = dipirona.CalculaDoseMin(idade, peso);
				/*
				 * (R.id.idadeEditText, R.id.pesoEditText);
				 */
				stringResultado = ("No máximo " + dosagemMax + "mg de "
						+ dipirona.getIntervalo() + " em "
						+ dipirona.getIntervalo() + " horas\n\n" +

						"No mínimo " + dosagemMin + " mg de "
						+ dipirona.getIntervalo() + " em "
						+ dipirona.getIntervalo() + " horas");
				//resultado.setText(stringResultado);
				
				if(stringResultado != null){
					dialogo.setTitle("Resultado");
					dialogo.setMessage(stringResultado);
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}else{
					dialogo.setTitle("Ops..");
					dialogo.setMessage("Algo deu errado!");
					dialogo.setNeutralButton("OK", null);
					dialogo.show();
				}
			}

		});

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.global, menu);
		return true;
	}

}
