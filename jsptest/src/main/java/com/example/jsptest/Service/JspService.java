package com.example.jsptest.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
public class JspService {
    public HashMap<String, Integer> computeSpaceConsumption(HashMap<String, Integer> map) throws IOException {
        List<String> commands = List.of("/bin/bash", "-c", "df -h | grep /dev/xvda128 | awk '{print $3, $4}'");
        ProcessBuilder builder = new ProcessBuilder(commands);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            log.info("log from lombok: " + line);
        }
        if(line != null){
            String[] arr = line.split(" ");
            for(String i : arr){
                log.info(i);
            }
        }
        return map;
    }
}
