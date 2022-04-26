package br.edu.uniaeso.cl.utils;

import java.io.*;

public class OperationRegister {
    private OperationRegister instance;
    File RegistroAlunos;
    private OperationRegister(){}
    public OperationRegister getInstance(){
        if(this.instance == null){
            this.instance = new OperationRegister();
        }else{
            return this.instance;
        }
        return this.instance;
    }
    public void operationLog() throws IOException {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(RegistroAlunos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) fis.close();
        }
    }
}
