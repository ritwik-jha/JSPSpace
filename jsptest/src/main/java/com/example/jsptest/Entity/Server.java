package com.example.jsptest.Entity;

public class Server {
    private String hostName;
    private String totalSpace;
    private String availableSpace;

    public Server(String hostName, String ts, String avS){
        this.hostName = hostName;
        this.totalSpace = ts;
        this.availableSpace = avS;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(String totalSpace) {
        this.totalSpace = totalSpace;
    }

    public String getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(String availableSpace) {
        this.availableSpace = availableSpace;
    }
}
