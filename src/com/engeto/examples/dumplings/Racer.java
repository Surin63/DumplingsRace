package com.engeto.examples.dumplings;

import java.time.LocalDate;

public class Racer {
     String name;
     LocalDate born;
     int numberOfDumplings;
     boolean isFinalResult;

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }
     public int addDumplings(int howMuch){
          this.numberOfDumplings = this.numberOfDumplings + howMuch;
          return this.numberOfDumplings;
     }
}
