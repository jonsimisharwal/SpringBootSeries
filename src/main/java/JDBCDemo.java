import java.sql.*;

public class JDBCDemo {
    private static final String URL="JDBC:MYSQL://localhost:3306/demo_db";
    private static final String USER="root";
    private static final String PASSWORD="saini800327";

    public static void main(String args[]) {
        //try with resources
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        ){
            System.out.println("connected to the database");
          //  insertStudnent(conn,"Alice","alice@gmail.com");

            Updatestudent(conn,1,"BOB","alice@gmail.com");
            selectStudents(conn);
            deleteStudent(conn,2);
            selectStudents(conn);

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    private static void insertStudnent(Connection conn,String name,String email){
         String sql="INSERT INTO Student(name,email) VALUES ('"+name+"','"+ email +"')";
         try(Statement stmt= conn.createStatement()){
             int rows= stmt.executeUpdate(sql);

             System.out.println("INSERTED:"+ rows);
         }catch(SQLException e){
             e.printStackTrace();
         }
    }
    private static void selectStudents(Connection conn){
        String sql="Select * from Student";
        try(Statement stmt=conn.createStatement()){
           ResultSet resultset=   stmt.executeQuery(sql);
           System.out.println("Student List:");
           while(resultset.next()){
               int id= resultset.getInt("id");
               String name= resultset.getString("name");
               String email= resultset.getNString("email");
               System.out.println("id:"+ id +"name:"+ name +" email:"+ email);
           }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private static void Updatestudent(Connection conn,int id,String name,String email){
        String sql="UPDATE Student SET name='"+ name +"', email='" + email+ "' WHERE id=" + id;

        try(Statement stmt= conn.createStatement()){
            int rows= stmt.executeUpdate(sql);

            System.out.println("UPDATED:"+ rows);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    private static void deleteStudent(Connection conn,int id){
        String sql="DELETE FROM Student WHERE ID="+id;
        try(Statement stmt= conn.createStatement()){
            int rows= stmt.executeUpdate(sql);

            System.out.println("DELETED:"+ rows);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

/*
 Connection conn=null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("connected to the database");
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
                System.out.println("connection closed..");
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
        }
 */