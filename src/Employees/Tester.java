package Employees;

import java.util.*;
import java.lang.reflect.*;

class Tester {
    private static List<Field> getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));

        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }

        return fields;
    }

    private static Field getField(Object obj, String fieldName) {
        List<Field> fields = getAllFields(new LinkedList<Field>(), obj.getClass());
        for(Field f : fields){
            if (f.getName().equals(fieldName)) {
                return f;
            }
        }
        return null;
    }

    private static Method getMethod(Object obj, String methodName) {
        Method[] methods = obj.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }
        return null;
    }

    public static void test (Employee employee) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter code: ");
        int code = scanner.nextInt();
        if (code == 1) {
            if(Modifier.isAbstract(Employee.class.getModifiers())) {
                System.out.println("SUCCESS");
            }else {
                System.out.println("FAILED");
            }
        }

        else if (code == 2) {
            Field name = getField(employee, "name");
            Field employeeId = getField(employee, "employeeId");
            Field salary = getField(employee, "salary");

            if(
                    (name != null && Modifier.isPrivate(name.getModifiers())) &&
                            (employeeId != null && Modifier.isPrivate(employeeId.getModifiers())) && (Modifier.isPrivate(salary.getModifiers()))
            ) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 3) {
            Method getName = Tester.getMethod(employee, "getName");
            Method getEmployeeId = Tester.getMethod(employee, "getEmployeeId");
            Method getSalary = Tester.getMethod(employee, "getSalary");
            Method setSalary = Tester.getMethod(employee, "setSalary");

            try {
                System.out.println(getName.invoke(employee));
                System.out.println(getEmployeeId.invoke(employee));
                System.out.println(getSalary.invoke(employee));
                setSalary.invoke(employee, 100);
                System.out.println(getSalary.invoke(employee));

                System.out.println("SUCCESS");
            }
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 4) {
            try {
                Method calculatePay = Employee.class.getDeclaredMethod("calculatePay");
                Method displayInfo = Employee.class.getDeclaredMethod("displayInfo");

                if (calculatePay != null) {
                    if(!(Modifier.isAbstract(calculatePay.getModifiers()))) {
                        System.out.println("FAILED");
                        return;
                    }
                }else {
                    System.out.println("FAILED");
                }

                if (displayInfo != null) {
                    if(!(Modifier.isAbstract(displayInfo.getModifiers()))) {
                        System.out.println("FAILED");
                        return;
                    }
                }else {
                    System.out.println("FAILED");
                }

                System.out.println("SUCCESS");
            }
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 5) {
            String testName = "Test";
            String employeeId = "123";
            double testHourlyRate = 10;
            double testHoursWorked = 10;

            HourlyEmployee newHourlyEmployee = new HourlyEmployee(testName, employeeId, testHourlyRate, testHoursWorked);

            if (newHourlyEmployee instanceof Employee) {
                Method getName = Tester.getMethod(newHourlyEmployee, "getName");
                Method getEmployeeId = Tester.getMethod(newHourlyEmployee, "getEmployeeId");

                Field hourlyRate = getField(newHourlyEmployee, "hourlyRate");
                Field hoursWorked = getField(newHourlyEmployee, "hoursWorked");

                try {

                    String name = getName.invoke(newHourlyEmployee).toString();

                    if (!name.equals(testName)) {
                        System.out.println("FAILED");
                        return;
                    }

                    String id = getEmployeeId.invoke(newHourlyEmployee).toString();

                    if (!id.equals(employeeId)) {
                        System.out.println("FAILED");
                        return;
                    }

                    if (hourlyRate != null) {
                        hourlyRate.setAccessible(true);
                        Object value = hourlyRate.get(newHourlyEmployee);
                        double rate = Double.parseDouble(value.toString());

                        if (rate != testHourlyRate) {
                            System.out.println("FAILED");
                            return;
                        }
                    } else {
                        System.out.println("FAILED");
                        return;
                    }

                    if (hoursWorked != null) {
                        hoursWorked.setAccessible(true);
                        Object value = hoursWorked.get(newHourlyEmployee);
                        double hours = Double.parseDouble(value.toString());

                        if (hours != testHoursWorked) {
                            System.out.println("FAILED");
                            return;
                        }
                    } else {
                        System.out.println("FAILED");
                        return;
                    }

                    System.out.println("SUCCESS");
                }
                catch(Exception e) {
                    System.out.println("FAILED");
                }
            }
        }

        else if (code == 6) {
            String testName = "Test";
            String employeeId = "123";
            double testAnnualSalary = 10000;

            SalariedEmployee newSalariedEmployee = new SalariedEmployee(testName, employeeId, testAnnualSalary);

            if (newSalariedEmployee instanceof Employee) {
                Method getName = Tester.getMethod(newSalariedEmployee, "getName");
                Method getEmployeeId = Tester.getMethod(newSalariedEmployee, "getEmployeeId");

                Field annualSalary = getField(newSalariedEmployee, "annualSalary");

                try {

                    String name = getName.invoke(newSalariedEmployee).toString();

                    if (!name.equals(testName)) {
                        System.out.println("FAILED");
                        return;
                    }

                    String id = getEmployeeId.invoke(newSalariedEmployee).toString();

                    if (!id.equals(employeeId)) {
                        System.out.println("FAILED");
                        return;
                    }

                    if (annualSalary != null) {
                        annualSalary.setAccessible(true);
                        Object value = annualSalary.get(newSalariedEmployee);
                        double salary = Double.parseDouble(value.toString());

                        if (salary != testAnnualSalary) {
                            System.out.println("FAILED");
                            return;
                        }
                    } else {
                        System.out.println("FAILED");
                        return;
                    }

                    System.out.println("SUCCESS");
                }
                catch(Exception e) {
                    System.out.println("FAILED");
                }
            }
        }

        else if (code == 7) {
            String testName = "Test";
            String employeeId = "123";
            double testCommissionRate = 10;
            double testSales = 100;

            CommissionedEmployee newCommissionedEmployee = new CommissionedEmployee(testName, employeeId, testCommissionRate, testSales);

            if (newCommissionedEmployee instanceof Employee) {
                Method getName = Tester.getMethod(newCommissionedEmployee, "getName");
                Method getEmployeeId = Tester.getMethod(newCommissionedEmployee, "getEmployeeId");

                Field commissionRate = getField(newCommissionedEmployee, "commissionRate");
                Field sales = getField(newCommissionedEmployee, "sales");

                try {

                    String name = getName.invoke(newCommissionedEmployee).toString();

                    if (!name.equals(testName)) {
                        System.out.println("FAILED");
                        return;
                    }

                    String id = getEmployeeId.invoke(newCommissionedEmployee).toString();

                    if (!id.equals(employeeId)) {
                        System.out.println("FAILED");
                        return;
                    }

                    if (commissionRate != null) {
                        commissionRate.setAccessible(true);
                        Object value = commissionRate.get(newCommissionedEmployee);
                        double rate = Double.parseDouble(value.toString());

                        if (rate != testCommissionRate) {
                            System.out.println("FAILED");
                            return;
                        }
                    } else {
                        System.out.println("FAILED");
                        return;
                    }

                    if (sales != null) {
                        sales.setAccessible(true);
                        Object value = sales.get(newCommissionedEmployee);
                        double salesValue = Double.parseDouble(value.toString());

                        if (salesValue != testSales) {
                            System.out.println("FAILED");
                            return;
                        }
                    } else {
                        System.out.println("FAILED");
                        return;
                    }

                    System.out.println("SUCCESS");
                }
                catch(Exception e) {
                    System.out.println("FAILED");
                }
            }
        }

        else if (code == 8) {
            String testName = "Test";
            String employeeId = "123";
            double testHourlyRate = 10;
            double testHoursWorked = 10;
            double testSalary = 100;

            HourlyEmployee newHourlyEmployee = new HourlyEmployee(testName, employeeId, testHourlyRate, testHoursWorked);

            Method calculatePay = Tester.getMethod(newHourlyEmployee, "calculatePay");
            Method getSalary = Tester.getMethod(newHourlyEmployee, "getSalary");

            try {
                calculatePay.invoke(newHourlyEmployee);
                double salary = Double.parseDouble(getSalary.invoke(newHourlyEmployee).toString());

                if (salary != testSalary) {
                    System.out.println("FAILED");
                    return;
                }

                if (salary != testSalary) {
                    System.out.println("FAILED");
                    return;
                }

                System.out.println("SUCCESS");
            }
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 9) {
            String testName = "Test";
            String employeeId = "123";
            double testAnnualSalary = 10000;

            SalariedEmployee newSalariedEmployee = new SalariedEmployee(testName, employeeId, testAnnualSalary);

            Method calculatePay = Tester.getMethod(newSalariedEmployee, "calculatePay");
            Method getSalary = Tester.getMethod(newSalariedEmployee, "getSalary");

            try {
                calculatePay.invoke(newSalariedEmployee);
                double salary = Double.parseDouble(getSalary.invoke(newSalariedEmployee).toString());

                if (salary != testAnnualSalary/26) {
                    System.out.println("FAILED");
                    return;
                }

                System.out.println("SUCCESS");
            }
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 10) {
            String testName = "Test";
            String employeeId = "123";
            double testCommissionRate = 0.50;
            double testSales = 10000;
            double testSalary = 5000;

            CommissionedEmployee newCommissionedEmployee = new CommissionedEmployee(testName, employeeId, testCommissionRate, testSales);

            Method calculatePay = Tester.getMethod(newCommissionedEmployee, "calculatePay");
            Method getSalary = Tester.getMethod(newCommissionedEmployee, "getSalary");

            try {
                calculatePay.invoke(newCommissionedEmployee);
                double salary = Double.parseDouble(getSalary.invoke(newCommissionedEmployee).toString());

                if (salary != testSalary) {
                    System.out.println("FAILED");
                    return;
                }

                System.out.println("SUCCESS");
            }
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 11) {
            Method calculatePay = Tester.getMethod(employee, "calculatePay");
            Method displayInfo = Tester.getMethod(employee, "displayInfo");

            try {
                calculatePay.invoke(employee);
                displayInfo.invoke(employee);
                System.out.println("SUCCESS");
            }
            catch(Exception e) {
                System.out.println("FAILED");
            }
        }
    }
}
