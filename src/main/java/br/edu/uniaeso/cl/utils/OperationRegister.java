package br.edu.uniaeso.cl.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OperationRegister {
    private static OperationRegister instance;
    private File RegistroAlunos;

    private OperationRegister() {
    }

    public static OperationRegister getInstance() {
        if (instance == null) {
            instance = new OperationRegister();
        } else {
            return instance;
        }
        return instance;
    }

    public void operationLog() throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("registroAlunos.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                fis.close();
        }
    }
}
