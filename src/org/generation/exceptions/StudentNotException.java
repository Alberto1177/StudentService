package org.generation.exceptions;


public class StudentNotException  extends Exception
{

    public StudentNotException( )
    {
        super( "Student not found!" );
    }
}
