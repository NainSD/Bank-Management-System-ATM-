package bank.management.system;
import java.sql.*; //import sql library
public class Conn { //for object design
    Connection c; //global obj
    Statement s; //global obj
    public Conn(){ //contructor
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver); //1.Driver registration
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "java#7042403914"); //2.create connection
            s=c.createStatement(); //3.create statement
        }
        catch(Exception e){
            System.out.println(e); //print runtime error
        }
    }
}
