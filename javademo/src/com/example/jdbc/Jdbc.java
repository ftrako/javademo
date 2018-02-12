package com.example.jdbc;

import com.example.test.ITest;
import java.util.List;

public class Jdbc implements ITest {
    @Override
    public void test() {
        Dao dao = new Dao();
        List<ObjBean> list = dao.query();
        for (int loop = 0; loop < list.size(); loop++) {
            ObjBean bean = list.get(loop);
            System.out.println("id=" + bean.id + ", name=" + bean.name);
        }
        dao.close();
    }
}
