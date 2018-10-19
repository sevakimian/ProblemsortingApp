package com.example.chova.problemsortingapp;

/**
 * Created by chova on 28/03/2018.
 */

public class Project {

    private String projectName;
    private String dim1;
    private String dim2;
    private String dim3;


     public void Project(String projectName, String dim1, String dim2, String dim3){
        this.projectName= projectName;
        this.dim1=dim1;
        this.dim2=dim2;
        this.dim3=dim3;
    }

    public void  Project(String projectName, String dim1, String dim2){
        this.projectName= projectName;
        this.dim1=dim1;
        this.dim2=dim2;
    }



}
