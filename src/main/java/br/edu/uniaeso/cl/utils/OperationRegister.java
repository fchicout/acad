package br.edu.uniaeso.cl.utils;

public class OperationRegister {
    private OperationRegister instance;
    private OperationRegister(){}
    public OperationRegister getInstance(){
        if(this.instance == null){
            this.instance = new OperationRegister();
        }else{
            return this.instance;
        }
        return this.instance;
    }



}
