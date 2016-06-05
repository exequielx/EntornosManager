package entornomanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.DefaultListModel;

public class Table {
    private final Main main;

    Table(Main aThis) {
        this.main = aThis;
    }

    public DefaultListModel getTables() throws Exception {
        DefaultListModel result = new DefaultListModel();
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT table_name, "
                + "CASE WHEN EXISTS(select a.idtabla from entorno.tablas a "
                + "where a.nombre = table_name) THEN (select a.idtabla from entorno.tablas a "
                + "where a.nombre = table_name) ELSE -1 END "
                + "FROM information_schema.tables WHERE table_schema='public' AND table_type='BASE TABLE'");
        while (rs.next()) {
            MySelectedObject mso = new MySelectedObject();
            mso.setValue(rs.getString(1));
            mso.setExist((rs.getInt(2) != -1));
            mso.setId(rs.getInt(2));
            result.addElement(mso);
        }
        rs.close();
        st.close();
        return result;

    }

    public HashMap getDataOfTable(String tabla) throws Exception {
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "select nombre,abrevi,CASE WHEN basededatos = 'adm' THEN 0 ELSE 1 END,"
                + "conexiondblink,titulo,visible,idtabla from entorno.tablas where nombre = '" + tabla + "'";
        main.log(q, 1);
        ResultSet rs = st.executeQuery(q);
        HashMap hm = null;
        if (rs.next()) {
            hm = new HashMap();
            hm.put("abrevi", rs.getString(2));
            hm.put("basededatos", rs.getInt(3));
            hm.put("conexiondblink", rs.getString(4));
            hm.put("titulo", rs.getString(5));
            hm.put("visible", rs.getBoolean(6));
            hm.put("idtabla", rs.getInt(7));
        }
        rs.close();
        st.close();
        return hm;
    }

    public Boolean save(MySelectedObject mySelectedObject, String abrevi, String basededatos, String conexiondblink, String titulo, Boolean visibl) throws Exception {

        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = null;
        String nombre = "'" + mySelectedObject.getValue() + "'";
        abrevi = ("".equals(abrevi.trim())) ? "null" : "'" + abrevi + "'";
        basededatos = ("".equals(basededatos.trim())) ? "null" : "'" + basededatos + "'";
        conexiondblink = ("".equals(conexiondblink.trim())) ? "null" : "'" + conexiondblink + "'";
        titulo = ("".equals(titulo.trim())) ? "null" : "'" + titulo + "'";
        String visible = (visibl) ? "true" : "false";
        if (mySelectedObject.getId() == -1) {
            q = "insert into entorno.tablas (nombre,abrevi,basededatos,conexiondblink,titulo,visible) values ("
                    + nombre + "," + abrevi + "," + basededatos + "," + conexiondblink + "," + titulo + "," + visible + ") returning idtabla";
        } else {
            q = "update entorno.tablas set "
                    + "abrevi = " + abrevi
                    + ", basededatos = " + basededatos
                    + ", conexiondblink = " + conexiondblink
                    + ", titulo = " + titulo
                    + ", visible = " + visible
                    + " WHERE idtabla = "
                    + mySelectedObject.getId()+" returning 0";
        }
        main.log(q, 1);
        ResultSet rs = st.executeQuery(q);
        boolean retorno = false;
        if (rs.next() && rs.getInt(1) != 0) {
            retorno = true;
        }
        rs.close();
        st.close();
        return retorno;
    }

    public boolean delete(MySelectedObject mySelectedObject) throws Exception {
        int idtabla = mySelectedObject.getId();
        if(idtabla == -1) return false;
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "delete from entorno.tablas where idtabla = " + idtabla + " returning idtabla";
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
}
