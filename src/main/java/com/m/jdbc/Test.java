package com.m.jdbc;

import com.m.jdbc.util.JDBCTools;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        findAll();
    }

    /**
     * i=0是新增，i=1是修改，i=2的删除
     * @param i
     */
    public static void saveOrUpdateOrDelete(int i){
        Connection connection = JDBCTools.getConnection();
        //3、定义 SQL
        String sql = null;
        switch (i){
            case 0:
                sql = "insert into student(name) values('张三')";
                break;
            case 1:
                sql = "update student set name = '杨三' WHERE id = 1";
                break;
            case 2:
                sql = "delete from student where id = 2";
                break;
        }
        Statement statement = null;
        try {
            statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTools.release(connection,statement,null);
        }
    }

    public static void saveOrUpdateOrDelete1(){
        Connection connection = JDBCTools.getConnection();
        String sql = "";
        try {
            PreparedStatement p = connection.prepareStatement(sql);
            p.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void findAll(){
        Connection connection = JDBCTools.getConnection();
        String sql = "select * from student";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(resultSet.next());
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                System.out.println(id+"-"+name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTools.release(connection,statement,resultSet);
        }

    }

}
