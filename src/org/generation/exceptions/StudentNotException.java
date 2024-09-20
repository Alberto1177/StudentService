package org.generation.exceptions;


public class StudentNotException  extends Exception
{

    public StudentNotException(String message )
    {
        super( "Student not found! ["+message +"]");
    }
}
