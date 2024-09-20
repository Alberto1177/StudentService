package org.generation;

import org.generation.classes.StudentService;
import org.generation.exceptions.CourseNotFoundException;
import org.generation.exceptions.StudentNotException;
import org.generation.classes.Student;


public class Main {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent(  new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(  new Student( "Ian", "1030", 28 ) );
        studentService.addStudent(  new Student( "Elise", "1040", 26 ) );
        studentService.addStudent(  new Student( "Santiago", "1050", 33 ) );

        //Inscribir al estudiante
        
        try {
        	studentService.enrollStudents( "Math", "1030" );
		} catch (CourseNotFoundException | StudentNotException e) {
			System.out.println(e.getMessage());
		}
        
        try {
        	studentService.enrollStudents( "Math", "1020" );
		} catch (CourseNotFoundException | StudentNotException e) {
			System.out.println(e.getMessage());
		}
        
        try {
        	studentService.enrollStudents( "History", "1040" );
		} catch (CourseNotFoundException | StudentNotException e) {
			System.out.println(e.getMessage());
		}
        
        try {
        	studentService.enrollStudents( "History", "1050" );
		} catch (CourseNotFoundException | StudentNotException e) {
			System.out.println(e.getMessage());
		}

        //Mostrar los cursos
        studentService.showAllCourses();
        
        //Muestra los alumnos inscritos en cada materia
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("History");

	}

}
