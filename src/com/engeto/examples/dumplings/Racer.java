package com.engeto.examples.dumplings;

import java.time.LocalDate;

public class Racer {
     String name;
     LocalDate born = LocalDate.MIN;
     int numberOfDumplings;
     boolean isFinalResult = false;

     public Racer(String name, LocalDate born, int numberOfDumplings) {
          this.name = name;
          this.born = born;
          this.numberOfDumplings = numberOfDumplings;
     }
     public Racer(String name, int numberOfDumplings){
          this.name = name;
          this.numberOfDumplings = numberOfDumplings;
     }

     public Racer(String name, LocalDate born) {
          this(name, born, 0);
     }

     public Racer() {
          this("Anonymous racer", LocalDate.MIN);
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public LocalDate getBorn() {
          return born;
     }

     public void setBorn(LocalDate born) {
          this.born = born;
     }

     public int getNumberOfDumplings() {
          return numberOfDumplings;
     }

     public void setNumberOfDumplings(int numberOfDumplings) {
          this.numberOfDumplings = numberOfDumplings;
     }

     public boolean isFinalResult() {
          return isFinalResult;
     }

     public void setFinalResult(boolean finalResult) {
          isFinalResult = finalResult;
     }
     public int addDumplings(int howMuch){
          this.numberOfDumplings = this.numberOfDumplings + howMuch;
          return this.numberOfDumplings;
     }
}
