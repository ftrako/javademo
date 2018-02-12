package com.example.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private Connection conn = null;

    public Dao() {
        open();
    }

    private void open() {
        if (conn != null) {
            return;
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://10.0.2.206:3306/javatest?characterEncoding=utf8&useSSL=false", "root", "");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<ObjBean> query() {
        List<ObjBean> list = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from t_obj;");
            list = new ArrayList<>(rs.getFetchSize() + 1);
            while (rs.next()) {
                ObjBean bean = new ObjBean();
                bean.id = rs.getString(1);
                bean.name = rs.getString(2);
                list.add(bean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
