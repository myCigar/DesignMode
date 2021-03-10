package com.CompositeReuse;

public class OracleDBUtil extends DBUtil {
    @Override
    public void getConnection() {
        System.out.println("Oracle database connectioned.");
    }
}
