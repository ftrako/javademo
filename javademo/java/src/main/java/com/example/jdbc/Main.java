package com.example.jdbc;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dao dao = new Dao();
		List<ObjBean> list = dao.query();
		System.out.println("size = " + (list == null ? 0 : list.size()));
		dao.close();
	}
}
