package com.example.jsptest.Service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

@Service
public class JspService {
    public HashMap<String, Integer> computeSpaceConsumption(HashMap<String, Integer> map) throws IOException {
        ProcessBuilder builder = new ProcessBuilder(
                "df", "-h", "|", "grep", "scratch", "|", "awk", "'{print $3, $4}'");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
        return map;
    }
}
