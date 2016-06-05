package entornomanager;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {
   private final Connection conn;
   private static Conexion instance = null;
   
   protected Conexion() throws Exception {
      Properties p = new Properties();
      if((new File("C:\\Users\\odin\\Desktop\\properties.ini")).exists())
            p.load(new FileInputStream("C:\\Users\\odin\\Desktop\\properties.ini"));
      else
            p.load(new FileInputStream("properties.ini"));
      this.conn = DriverManager.getConnection(
              "jdbc:postgresql://"+
              p.getProperty("host")+
              "/"+p.getProperty("database")+
              "?user="+p.getProperty("username")+
              "&password="+p.getProperty("password")+
              "&port="+p.getProperty("port")+"");
   }
   public static Conexion getInstance() throws Exception {
      if(instance == null) {
         instance = new Conexion();
      }
      return instance;
   }
   
   public Connection getConexion(){
        return this.conn;
   }
}
