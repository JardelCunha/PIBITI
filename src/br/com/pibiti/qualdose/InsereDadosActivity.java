package br.com.pibiti.qualdose;

import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.AcidoAcetilsalicilico;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Buprenorfina;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.DiclofenacoPotassico;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.DiclofenacoSodico;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Dipirona;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Ibuprofeno;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Nimesulida;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Paracetamol;
import br.com.pibiti.qualdose.medicameto.analgesicoantitermico.Tramadol;
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

	private static final String[] listaMedicamentos = {
		"Selecione o medicamento...",
		"Ácido Acetilsalicílico",
		"Buprenorfina",
		"Diclofenaco Potássico",
		"Diclofenaco Sódico",
		"Dipirona",
		"Ibuprofeno",
		"Nimesulida",
		"Paracetamol",
	"Tramadol"};

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
							CalculaAcidoAcetilsalicilico();
							break;

						case 2:
							CalculaBuprenorfina();
							break;

						case 3:
							CalculaDiclofenacoPotassico();
							break;

						case 4:
							CalculaDiclofenacoSodico();
							break;

						case 5:
							CalculaDipirona();
							break;

						case 6:
							CalculaIbuprofeno();
							break;

						case 7:
							CalculaNimesulida();
							break;

						case 8:
							CalculaParacetamol();
							break;

						case 9:
							CalculaTramadol();
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


			private void SelecioneUmMedicamento() {
				dialogo.setTitle("Ops..");
				dialogo.setMessage("Você esqueceu de selecionar um medicamento!");
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}

			private void CalculaAcidoAcetilsalicilico() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());


				AcidoAcetilsalicilico AcidoAcetilsalicilico = new AcidoAcetilsalicilico();

				double dosagemMax = AcidoAcetilsalicilico.CalculaDoseMax(idade, peso);
				double dosagemMin = AcidoAcetilsalicilico.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 4/4horas ou 6/6horas\n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 4/4horas ou 6/6horas\n\n ");

				dialogo.setTitle("Resultado - "+AcidoAcetilsalicilico.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();

			}


			private void CalculaBuprenorfina() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());


				Buprenorfina buprenorfina = new Buprenorfina();


				double dosagemMax = buprenorfina.CalculaDoseMax(idade, peso);
				double dosagemMin = buprenorfina.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 6/6horas ou 8/8horas\n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 6/6horas ou 8/8horas\n\n");

				dialogo.setTitle("Resultado - "+buprenorfina.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();

			}

			private void CalculaDiclofenacoPotassico() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());

				//criando um objeto do tipo Diclofenaco Potassico
				DiclofenacoPotassico diclofenacoPotassico = new DiclofenacoPotassico();

				//invocando o método calculaDoseMax e CalculaDoseMin de Diclofenaco Potassico
				double dosagemMax = diclofenacoPotassico.CalculaDoseMax(idade, peso);

				double dosagemMin = diclofenacoPotassico.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 6/6horas ou 12/12horas\n\n"
						+"No mínimo " + dosagemMin + " mg de 6/6horas ou 12/12horas\n\n ");

				dialogo.setTitle("Resultado - "+diclofenacoPotassico.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();

			}

			private void CalculaDiclofenacoSodico() {
				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());

				//criando um objeto do tipo Diclofenaco Sodico
				DiclofenacoSodico diclofenacoSodico = new DiclofenacoSodico();

				//invocando o método calculaDoseMax e CalculaDoseMin de Diclofenaco Sodico
				double dosagemMax = diclofenacoSodico.CalculaDoseMax(idade, peso);

				double dosagemMin = diclofenacoSodico.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 12/12horas \n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 12/12horas \n\n ");

				dialogo.setTitle("Resultado - "+diclofenacoSodico.getNome());
				dialogo.setMessage(stringResultado);
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

				//invocando o método calculaDoseMax e CalculaDoseMin de paracetamol
				double dosagemMax = paracetamol.CalculaDoseMax(idade, peso);

				double dosagemMin = paracetamol.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 6/6horas \n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 6/6horas \n\n"
						+"Dose Máxima: 5 doses ao dia.");

				dialogo.setTitle("Resultado - "+paracetamol.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
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

				double dosagemMin = nimesulida.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 12/12horas \n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 12/12horas \n\n ");


				dialogo.setTitle("Resultado - "+nimesulida.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
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
				double dosagemMin = ibuprofeno.CalculaDoseMin(idade, peso);

				//a dose máxima é 40mg/kg/dia
				double doseMaxima = 40*peso;

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 6/6horas ou 8/8horas\n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 6/6horas ou 8/8horas\n\n"
						+"Dose Máxima: "+ String.format("%.2f",doseMaxima)+" por dia.");

				dialogo.setTitle("Resultado - "+ibuprofeno.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
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

				double dosagemMin = dipirona.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 6/6horas \n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 6/6horas \n\n"
						+"Dose Máxima: 500mg");

				dialogo.setTitle("Resultado - "+dipirona.getNome());
				dialogo.setMessage(stringResultado);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
			}

			private void CalculaTramadol() {

				int idade = Integer
						.parseInt(editTextIdade.getText().toString());
				double peso = Double.parseDouble(editTextPeso.getText()
						.toString());

				Tramadol tramadol = new Tramadol();

				double dosagemMax = tramadol.CalculaDoseMax(idade, peso);
				double dosagemMin = tramadol.CalculaDoseMin(idade, peso);

				stringResultado = ("No máximo " + String.format("%.2f",dosagemMax) + "mg de 4/4horas ou 6/6horas\n\n"
						+"No mínimo " + String.format("%.2f",dosagemMin) + " mg de 4/4horas ou 6/6horas\n\n"
						+"Dose Máxima: 400mg/dia");;

						dialogo.setTitle("Resultado");
						dialogo.setMessage(stringResultado);
						dialogo.setNeutralButton("OK", null);
						dialogo.show();

			}

		});

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.global, menu);
		return true;
	}

}
