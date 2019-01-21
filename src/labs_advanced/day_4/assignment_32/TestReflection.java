package labs_advanced.day_4.assignment_32;
import labs_advanced.day_4.assignment_32.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestReflection {
    public static void main(String[] args) {
        try {
            Class classobj = Class.forName("labs_advanced.day_4.assignment_32.Employee");
            System.out.println("Class Name : "+classobj.getName());
            System.out.println("Methods : ");
            Method methods[] = classobj.getMethods();
            for (Method method : methods)
            {
                System.out.println("\nMethod Name : "+method.getName());
                System.out.println("No_of_Parameters : "+method.getParameterCount());
                Parameter parameter[] = method.getParameters();
                System.out.println("Parameters : ");
                for (int i = 0; i < method.getParameterCount(); i++) {
                    System.out.println(parameter[i].toString());
                }
            }
            Field fields[] = classobj.getFields();
            System.out.println("Fields : "+fields.length);
            for (Field field:fields)
            {
                System.out.println("Field Name : "+field.getName());
                System.out.println("Type : "+field.getType());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
