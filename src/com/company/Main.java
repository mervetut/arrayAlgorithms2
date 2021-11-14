package com.company;

public class Main {

    public static void main(String[] args) {
	String [] students = {"Alissa", "Ben", "Charlie", "Dianna"};
	String[] grades = {"B", "D", "B", "A"};

		int index = 0;
		boolean found = true;
		while (found && index < students.length) {
			if (students[index] == grades[index])
				found = true;

			System.out.println("Charlie's grade: " + grades[2]);
			break;
		}


	//while ()
	//	for (int i = 0; i <= students.length; i++)
	  //  if (students[i] == grades[i])
        //    System.out.println(grades);

	//if (boolean equals(String students))
      //  System.out.println(grades);
    }
}