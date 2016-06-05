package entornomanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;

public class Relation {
    private final Main main;

    Relation(Main aThis) {
        this.main = aThis;
    }

    Boolean save(String relacion, int idtablaorigen, int idcampoorigen, String tabladestino, String campodestino) throws Exception {
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = null;
        relacion = ("".equals(relacion.trim())) ? "null" : "'" + relacion + "'";
        tabladestino = ("".equals(tabladestino.trim())) ? "null" : "'" + tabladestino + "'";
        campodestino = ("".equals(campodestino.trim())) ? "null" : "'" + campodestino + "'";
        q = "insert into entorno.tablarelacion (relacion,idtablaorigen,idcampoorigen,idtabladestino,idcampodestino) "
                + "values(" + relacion + "," + idtablaorigen + "," + idcampoorigen + ",(select idtabla from entorno.tablas where nombre = " + tabladestino + "), "
                + "(select idcampo from entorno.campos where campo = " + campodestino + " and idtabla = (select idtabla from entorno.tablas where nombre = " +
                tabladestino + "))) returning idrelacion";

        main.log(q, 1);
        ResultSet rs = st.executeQuery(q);
        boolean retorno = false;
        if (rs.next()) {
            retorno = true;
        }
        rs.close();
        st.close();
        return retorno;
    }

     public boolean delete(MySelectedObject mySelectedObject) throws Exception {
        int idrelation = mySelectedObject.getId();System.out.println("fefe"+idrelation);
        if(idrelation == -1) return false;
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "delete from entorno.tablarelacion where idrelacion = " + idrelation + " returning idrelacion";
        main.log(q, 1);
        ResultSet rs = st.executeQuery(q);
        boolean retorno = false;
        if (rs.next()) {
            retorno = true;
        }
        rs.close();
        st.close();
        return retorno;
    }

    DefaultListModel getRelations(int idcampo, int idtabla) throws Exception  {
         Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "select tr.relacion,t.nombre tabladestino," +
            "c.campo campodestino, tr.idrelacion from entorno.tablarelacion  tr " +
            "join entorno.tablas t on t.idtabla = tr.idtabladestino " +
            "join entorno.campos c on c.idcampo = tr.idcampodestino " +
            "where tr.idcampoorigen = "+idcampo+" and tr.idtablaorigen = "+idtabla+" order by tr.idrelacion desc";
         
        ResultSet rs = st.executeQuery(q);
       
            rs = st.executeQuery(q);
            DefaultListModel relations = new DefaultListModel(); 
            MySelectedObject mso ;
            while (rs.next()){
                 mso = new MySelectedObject();
                 mso.setExist(false);
                 mso.setValue(rs.getString(1)+" "+rs.getString(2)+" ON "+rs.getString(3));
                 mso.setId(rs.getInt(4));
                 relations.addElement(mso);
            }
    return relations;
    }

}
