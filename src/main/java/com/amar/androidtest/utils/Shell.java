/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.androidtest.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amar
 */
public class Shell {

    public static void main(String args[]) throws IOException {
        Shell shell = new Shell();

        String cmd_ping = "ping -c 20 www.baidu.com";
        String cmd_config = "ifconfig -a";

        p("hello world!");
        //p(shell.cmdOnce(cmd_ping));

        shell.cmdLongTime(cmd_ping);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(shell.getInput()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            p(line);
        }
    }

    public static void p(String info) {
        System.out.println(info);
    }

    /**
     * @param command 可以立即返回结果的shell命令 ,如ifconfig -a
     * @return
     */
    public String cmdOnce(String command) {
        StringBuffer sb = new StringBuffer();
        BufferedReader bufferedReader = null;
        try {
            Process ps = Runtime.getRuntime().exec(command);
            ps.waitFor();

            bufferedReader = new BufferedReader(new InputStreamReader(ps.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    bufferedReader = null;
                } catch (IOException ex) {
                }
            }
        }
        return sb.toString();
    }

    private OutputStream output;
    private Process process;
    private InputStream input;

    /**
     * 需要运行很久的shell命令，只能去操作 input和output了
     * @param command 如：ping -c 1000 www.google.com
     */
    public void cmdLongTime(String command) {
        try {
            process = Runtime.getRuntime().exec(command);
            input = process.getInputStream();
            output = process.getOutputStream();
        } catch (IOException ex) {
        }
    }

    public OutputStream getOutput() {
        return output;
    }

    public void setOutput(OutputStream output) {
        this.output = output;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public InputStream getInput() {
        return input;
    }

    public void setInput(InputStream input) {
        this.input = input;
    }

}
