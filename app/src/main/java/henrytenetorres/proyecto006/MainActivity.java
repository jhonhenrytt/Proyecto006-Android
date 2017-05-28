package henrytenetorres.proyecto006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Primero definimos dos vectores paralelos donde almacenamos en uno los nombres de países
    // y en el otro almacenamos la cantidad de habitantes de dichos países:
    private String []paises={"Argentina", "Chile", "Paraguay", "Bolivia",
            "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay","Guyana","Surinam"};
    //Definimos un objeto de tipo TextView y otro de tipo ListView donde almacenaremos
    // las referencias a los objetos que definimos en el archivo XML:
    private String []habitantes={" 43823000","18286000","6905000","11066000","31660000","16656000","207012000",
            "49067000","31236000","3487000","746000","570000"};
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.list1);
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
        public void onItemClick(AdapterView adapterView, View view, int i, long l) {
            tv1.setText("Población de "+ lv1.getItemAtPosition(i) + " es "+ habitantes[i]+" habitantes");
        }});
    }

}
