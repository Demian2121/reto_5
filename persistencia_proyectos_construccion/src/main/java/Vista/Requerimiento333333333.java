package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_3;

public class Requerimiento333333333 extends JFrame {
    public Requerimiento333333333() throws SQLException {
        initUI();
    }
    private void initUI() throws SQLException {

        setLayout(new BorderLayout());
        String[] nombres = {"Proveedor", "Pagad", "Constructora",};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true); 

    }

    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_3> lista = new ArrayList<Requerimiento_3>();

        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento3();
        String matris[][] = new String [lista.size()][5];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getProveedor();
            matris[i][1] = lista.get(i).getPagado();
            matris[i][2] = lista.get(i).getConstructora();
            
            
        }
        return matris;
    }
    
    
}
