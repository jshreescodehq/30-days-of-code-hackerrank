/* Given two classes, Person and Student, where Person is the base class and Student is the derived class.
Student inherits all the properties of Person.
A Student class constructor, which has 4 parameters:
1. A string: firstName.
2. A string: lastName.
3. An integer: idNumber.
4. An integer array (or vector) of test scores: scores .
5. A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:*/
import java.util.*;
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	} 
}
class Student extends Person{
	private int[] testScores;
    Student(String firstname, String lastname, int idNumber, int[] scores){
        super(firstname, lastname, idNumber);
        this.testScores = scores;
    }
    char calculate(){
        int sum = 0;
        for(int i =0;i<testScores.length;i++){
            sum+=testScores[i];
        }
        int avg = sum/testScores.length;
        if(avg>=90 && avg<=100){
            return 'O';
        }
        else if(avg>=80 && avg<90){
            return 'E';
        }
        else if(avg>=70 && avg<80){
            return 'A';
        }
        else if(avg>=55 && avg<70){
            return 'P';
        }
        else if(avg>=40 && avg<55){
            return 'D';
        }
        else{
            return 'T';
        }
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
