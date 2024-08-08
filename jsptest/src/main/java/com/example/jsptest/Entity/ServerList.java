package com.example.jsptest.Entity;

import java.util.ArrayList;

public class ServerList {
    private static ArrayList<Server> serverList = new ArrayList<>();

    public static ArrayList<Server> getServers(){
        serverList.add(new Server("ofss-mum-5366.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("fsgbu-mum-259.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("ofss-mum-363.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("ofss-mum-364.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("ofss-mum-365.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("fsgbu-mum-814.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("fsgbu-mum-813.snbomprshared1.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("ofss-mum-5056.snbomprshared2.gbucdsint02bom.oraclevcn.com", "-1", "-1"));
        serverList.add(new Server("ofss-mum-5119.snbomprshared2.gbucdsint02bom.oraclevcn.com", "-1", "-1"));

        return serverList;
    }
}
