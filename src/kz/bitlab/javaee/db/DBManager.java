package kz.bitlab.javaee.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private static Connection connection;

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bootcamp","root","");

        }catch (Exception e){

        }
    }

    public static void addItem(Item item){
       try{
           PreparedStatement statement = connection.prepareStatement(
                   "INSERT INTO items (name, description, price) VALUES (?,?,?)");
           statement.setString(1,item.getName());
           statement.setString(2, item.getDescription());
           statement.setDouble(3,item.getPrice());
           statement.executeUpdate();
           statement.close();

       }catch (Exception e){

       }
    }

    public static void addUser(User user){
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users (email, password, full_name) " +
                    "VALUES (?,?,?)");
            statement.setString(1,user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3,user.getFullName());
            statement.executeUpdate();
            statement.close();
        }catch (Exception e){

        }
    }

    public static ArrayList<Item> getAllItems(){
        ArrayList<Item> items = new ArrayList<>();
        try{
           PreparedStatement statement = connection.prepareStatement("SELECT * FROM items");
           ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = resultSet.getDouble("price");
                items.add(new Item(id,name,description,price));
            }
            statement.close();
        }catch (Exception e){

        }
        return items;
    }

    public static User getUser(String email){
        User user = null;
        try{
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE email = ?");
            statement.setString(1,email);

            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                user = new User();
                user.setId((long) resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setFullName(resultSet.getString("full_name"));
            }
            statement.close();
        }catch (Exception e){

        }


        return user;
    }
}
