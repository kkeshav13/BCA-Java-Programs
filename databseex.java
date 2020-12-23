import java.io.*;
import java.sql.*;

public class RetrieveFile {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system","oracle");

            PrerparedStatement ps =con.prepareStatement("select * from filetable");
            ResultSet rs = ps.executeQuery();
            rs.next();

            Clob c =rs.getClob(2);
            Reader r = c.getCharachterStream();

            FileWriter fw = new FileWriter("retrivefile.txt");

            int i;
            while((i= r.read())!=-1)
                fw.write((char)i);

            fw.close();
            con.close();

            System.out.println("SUCCESS!");
       }catch(Exception e){
                            e.printStackTrace();
                            }
    }
}