package main.java;

import main.java.Controllers.ProgramMain;

public class Main {
    public static void main(String[] args) {

        try(ProgramMain sys = new ProgramMain()){
            sys.start();
        }
    }
}
