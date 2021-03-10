package com.CompositeReuse;

public class CustomerDAO {
    DBUtil dbUtil = new OracleDBUtil();

    public void addCustomer() {
        dbUtil.getConnection();
    }
}
