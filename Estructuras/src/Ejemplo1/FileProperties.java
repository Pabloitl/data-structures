package Ejemplo1;
//////////////////////////////////////////////////////////////
// From JAVA PROGRAMMING: FROM THE BEGINNING, by K. N. King //
// Copyright (c) 2000 W. W. Norton & Company, Inc.          //
// All rights reserved.                                     //
// This program may be freely distributed for class use,    //
// provided that this copyright notice is retained.         //
//                                                          //
// FileProperties.java (Chapter 14, page 610)               //
//////////////////////////////////////////////////////////////

// Displays the properties of a file

import java.io.*;       // 8 de marzo 2019
import java.util.Scanner;

public class FileProperties {
  public static void main(String[] args) {
    Scanner tecla = new Scanner(System.in);
    String fileName = null;
    File f = null;

    // Prompt user to enter file name
    System.out.print("Enter a file name: ");
    fileName = tecla.nextLine();
    // Create a File object
    f = new File(fileName);
    // Display properties of file
    if (f.exists()) {
      System.out.print("File "+fileName);
      if (f.canRead()) System.out.print(" can be read ");
      if (f.canWrite()) System.out.print(", can be written ");
      if (f.isDirectory()) System.out.println(" and is a directory");
      if (f.isFile()) System.out.println(" and is normal");
      System.out.println("Path of file: " + f.getAbsolutePath() );
      System.out.println("Length of file: " + f.length());
    } else System.out.println("File "+fileName+" does not exist.");
  }
}

