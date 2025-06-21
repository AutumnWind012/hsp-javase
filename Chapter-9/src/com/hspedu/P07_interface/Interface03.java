package com.hspedu.P07_interface;

public class Interface03 {
    public static void main(String[] args) {

        use(new MySQLDb());

        use(new OracleDb());
    }

    public static void use(DbInterface db) {
        db.connect();
        db.close();
    }
}


class MySQLDb implements DbInterface {
    @Override
    public void connect() {
        System.out.println("连接 MySQL ...");
    }

    @Override
    public void close() {
        System.out.println("关闭 MySQL ...");
    }
}

class OracleDb implements DbInterface {
    @Override
    public void connect() {
        System.out.println("连接 Oracle ...");
    }

    @Override
    public void close() {
        System.out.println("关闭 Oracle ...");
    }
}

class Db2 implements DbInterface {
    @Override
    public void connect() {
        System.out.println("连接 DB2 ...");
    }

    @Override
    public void close() {
        System.out.println("关闭 DB2 ...");
    }
}
