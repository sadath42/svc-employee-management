package com.basics.scope;

public class VariableScope {

    private String scope = "global";


    public void scopeExample(){

        {

            String scope2 = "local";

            for (int i=0;i<10;i++){
                String  scope3= ""+i;
                System.out.println(scope3);
                scope2 = scope2+scope3;
                scope = scope2+scope3;
            }
            System.out.println("scopre2---->"+scope2);
            System.out.println("scope---->"+scope);

        }

    }

    public static void main(String[] args){
        VariableScope variableScope = new VariableScope();
        System.out.println("scope---->"+variableScope.scope);
        variableScope.scopeExample();
        System.out.println("scope---->"+variableScope.scope);

    }
}