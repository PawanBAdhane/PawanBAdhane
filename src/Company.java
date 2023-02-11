import src.Employee;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Company {

    public static void main(String[] args) throws IOException {
        Console cns = System.console();

        System.out.println("username: ");
        String usn= "HK";
        String pwd = new String("Nit#1");

        if (usn.equalsIgnoreCase("HK") && pwd.equals("Nit#1")) {

            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            Scanner scn = new Scanner(System.in);

            Employee emp = new Employee();

            emp.eno = Integer.parseInt((args[0]));
            emp.ename = args[1];

            System.out.print("Enter Sal: ");
            emp.sal = Double.parseDouble(br.readLine());

            System.out.print("Enter dept");
            emp.dept = br.readLine();

            System.out.print("Enter mobile: ");
            emp.mobile = scn.nextLong();
            scn.nextLine();

            System.out.print("Enter email: ");
            emp.email = scn.nextLine();

            emp.gender = System.getProperty("gender").charAt(0);
            emp.workingStatus = Boolean.parseBoolean(System.getProperty("status"));

            System.out.println(
                    "Emp object is created and initialized by reading values" + "from end-user from KB"
            );

            System.out.println(" \nEmp object details");
            System.out.println("eno\t\t\t: " + emp.eno);
            System.out.println("ename\t\t\t: " + emp.ename);
            System.out.println("sal\t\t\t: " + emp.sal);
            System.out.println("dept\t\t\t: " + emp.dept);
            System.out.println("mobile\t\t\t: " + emp.mobile);
            System.out.println("email\t\t\t: " + emp.email);
            System.out.println("gender\t\t\t: " + emp.gender);
            System.out.println("workingStatus\t\t: " + emp.workingStatus);

        } else {
            System.out.println(
                    "ABC: Invalid username and password");
        }
    }
}





