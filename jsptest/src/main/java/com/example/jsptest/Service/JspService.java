package com.example.jsptest.Service;

import com.example.jsptest.Entity.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
public class JspService {
    public ArrayList<Server> findConsumptionForAllServer(ArrayList<Server> servers){
        log.info("Entering findConsumptionForAllServer");
        for(Server currServer : servers){
            try{
                log.info("computing for server: " + currServer.getHostName());
                String[] computeOutput = computeSpaceConsumption(currServer.getHostName(), "", "");
                log.info("computed details: " + computeOutput[0] + computeOutput[1]);
                currServer.setAvailableSpace(computeOutput[0]);
                currServer.setTotalSpace(computeOutput[1]);
            }
            catch (Exception e){
                log.info(e.toString() + ": " + e.getMessage());
            }
        }
        log.info("Exiting findConsumptionForAllServer");
        return servers;
    }
    public String[] computeSpaceConsumption(String hostname, String username, String password) throws IOException {
        log.info("Entering computeSpaceConsumption");
        List<String> commands = List.of("/bin/bash", "-c", "df -h | grep /dev/xvda128 | awk '{print $3, $4}'");
        ProcessBuilder builder = new ProcessBuilder(commands);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) {
                break;
            }
            if (line != null) {
                String[] arr = line.split(" ");

//                log.info("space available -> " + arr[0]);
//                log.info("total space -> " + arr[1]);
                log.info("Returning from computeSpaceConsumption");
                return arr;

            } else {
                log.info("line is null");
            }
        }

        log.info("Returning null from computeSpaceConsumption");
        return null;
    }
}
