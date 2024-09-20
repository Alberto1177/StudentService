package org.generation;

import org.generation.classes.StudentService;
import org.generation.classes.Student;


public class Main {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent( "1030", new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent( "1040", new Student( "Ian", "1020", 28 ) );
        studentService.addStudent( "1050", new Student( "Elise", "1020", 26 ) );
        studentService.addStudent( "1020", new Student( "Santiago", "1020", 33 ) );

        //Inscribir al estudiante
        studentService.enrollStudents( "Math", "1030" );
        
        //Mostrar los cursos
        studentService.showAllCourses();

	}

}
