package entornomanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.DefaultListModel;

public class Column {
    private final Main main;

    Column(Main aThis) {
        this.main = aThis;
    }

    public DefaultListModel getColumns(String tabla) throws Exception {
        DefaultListModel result = new DefaultListModel();
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "SELECT column_name ,"
                + "CASE WHEN EXISTS(select a.idcampo from entorno.campos a join entorno.tablas b on a.idtabla = b.idtabla "
                + "where b.nombre = table_name and a.campo = column_name) THEN (select a.idcampo from entorno.campos a join entorno.tablas b on a.idtabla = b.idtabla "
                + "where b.nombre = table_name and a.campo = column_name) ELSE -1 END "
                + "FROM information_schema.columns "
                + "WHERE table_schema = 'public' and table_name = '" + tabla + "' order by table_name,ordinal_position";
       
        ResultSet rs = st.executeQuery(q);
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

    HashMap getDataOfColumn(String columna, int idtabla) throws Exception {
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "SELECT campo,alias,CASE WHEN tipodato = 'varchar' THEN 0 WHEN tipodato = 'integer' THEN 1 "
                + "WHEN tipodato = 'boolean' THEN 2 WHEN tipodato = 'timestamp' THEN 3 ELSE 0 END, "
                + "titulo,visible,idcampo FROM entorno.campos WHERE idtabla = " + idtabla + " and campo = '" + columna + "'";
        main.log(q, 1);
        ResultSet rs = st.executeQuery(q);
        HashMap hm = null;
        if (rs.next()) {
            hm = new HashMap();
            hm.put("alias", rs.getString(2));
            hm.put("tipodato", rs.getInt(3));
            hm.put("titulo", rs.getString(4));
            hm.put("visible", rs.getBoolean(5));
            hm.put("idcampo", rs.getInt(6));
            
            Relation r = new Relation(this.main);
            hm.put("relations", r.getRelations(rs.getInt(6), idtabla));
        }
        rs.close();
        st.close();
        return hm;
    }

    Boolean save(MySelectedObject mySelectedObject, int idtabla,String alias, String titulo, String tipodato, boolean visibl) throws Exception{
       Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = null;
        String campo = "'" + mySelectedObject.getValue() + "'";
        alias = ("".equals(alias.trim())) ? "null" : "'" + alias + "'";
        tipodato = ("".equals(tipodato.trim())) ? "null" : "'" + tipodato + "'";
        titulo = ("".equals(titulo.trim())) ? "null" : "'" + titulo + "'";
        String visible = (visibl) ? "true" : "false";
        if (mySelectedObject.getId() == -1) {
            q = "insert into entorno.campos (campo,alias,titulo,tipodato,visible,idtabla) values ("
                    + campo + "," + alias + "," + titulo + "," + tipodato + "," + visible + "," + idtabla+") returning idcampo";
        } else {
            q = "update entorno.campos set "
                    + "alias = " + alias
                    + ", tipodato = " + tipodato
                    + ", titulo = " + titulo
                    + ", visible = " + visible
                    + " WHERE idcampo = "
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
        int idcampo = mySelectedObject.getId();
        if(idcampo == -1) return false;
        Connection conn = Conexion.getInstance().getConexion();
        Statement st = conn.createStatement();
        String q = "delete from entorno.campos where idcampo = " + idcampo + " returning idcampo";
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
