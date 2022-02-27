package com.example.democalculatorbaur;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebResult;
import static java.lang.Math.sqrt;

@WebService(serviceName = "Calculator" )

public class Calculator {

    @WebMethod(operationName = "add")

    public double add (double a, double b) {

        double result;
        result = a + b;

        return result;
    }

    @WebMethod(operationName = "sub")

    public double sub (double a, double b) {

        double result;
        result = a - b;

        return result;
    }

    @WebMethod(operationName = "mul")

    public double mul (double a, double b) {

        double result;
        result = a * b;

        return result;
    }

    @WebMethod(operationName = "div")

    public double div (double a, double b) {

        double result;

        result = a / b;

        return result;
    }

    @WebMethod(operationName = "sqrt")

    public double Sqrt(double sqr) {
        return sqrt(sqr);
    }

}
