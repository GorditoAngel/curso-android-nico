package curso.casos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ControlNombreApellido extends LinearLayout {
	private EditText txtNombre;
	private EditText txtApellido1;
	private EditText txtApellido2;
	private TextView lblTodo;
	private Button btnMostrar;
	private Button btnBorrar;
	
	//Sobrescribimos el primer constructor
	public ControlNombreApellido(Context context) {
		super(context);
		Initialize();
	}
	//Sobrescribimos el segundo constructor
	public ControlNombreApellido(Context context, AttributeSet attrs)	{
		super(context, attrs);
		Initialize();
	}
	
	private void Initialize(){
		String interfaz = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater inflater =
		(LayoutInflater)getContext().getSystemService(interfaz);
		inflater.inflate(R.layout.caso6control, this,true);
		//Hacemos accesibles los controles
		//NOTA: Las etiquetas no las necesitamos
		txtNombre = (EditText)findViewById(R.id.caso6txtNombre);
		txtApellido1 = (EditText)findViewById(R.id.caso6txtApellido1);
		txtApellido2 = (EditText)findViewById(R.id.caso6txtApellido2);
		lblTodo=(TextView)findViewById(R.id.caso6lblTodo);
		btnMostrar=(Button)findViewById(R.id.caso6btnMostrar);
		btnBorrar=(Button)findViewById(R.id.caso6btnBorrar);
		
		//Añadimos los eventos necesarios
		AddEvents();
	}
	private void AddEvents() {
		
		View.OnClickListener eventoMostrar = new View.OnClickListener() {
			public void onClick(View v) {
				Mostrar();
			}
		};
		View.OnClickListener eventoBorrar = new View.OnClickListener() {
			public void onClick(View v) {
				Borrar();
			}
		};
 	   	btnMostrar.setOnClickListener(eventoMostrar);
 	   	btnBorrar.setOnClickListener(eventoBorrar);
		
		
		
	}
	
	private void Borrar() {
		txtNombre.setText("");
		txtApellido1.setText("");
		txtApellido2.setText("");
		lblTodo.setText(getResources().getString(R.string.caso6todo));
	}
	
	private void Mostrar(){
		lblTodo.setText(getNombreYApellidos());
	}
	
	//Recuperamos el nombre
	public String getNombre() {
		return txtNombre.getText().toString();
	}
	//Recuperamos el nombre
	public String getApellido1() {
		return txtApellido1.getText().toString();
	}
	//Recuperamos el nombre
	public String getApellido2() {
		return txtApellido2.getText().toString();
	}
	//Recuperamos el nombre con los apellidos
	public String getNombreYApellidos() {
		return txtNombre.getText().toString() + " " + txtApellido1.getText().toString() + " " 	+ txtApellido2.getText().toString();
	}
	//Recuperamos apellidos, nombre
	public String getApellidosNombre() {
		return txtApellido1.getText().toString() + " " 	+ txtApellido2.getText().toString() + ", " + txtNombre.getText().toString();
	}

	
	
}
