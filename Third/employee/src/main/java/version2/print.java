///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author User
// */
//public class print {
//    System.out.println("============ COMMISSION EMPLOYEE ============\n");
//        System.out.println("======= Constructor 1");
//        CommissionEmployee x = new CommissionEmployee(5431, "CEKenny", 153032);
//        x.displayCommissionEmployee();// the toString() is overridden in CommissionEmp
//        
//        System.out.println("\n======= Constructor 2");
//        CommissionEmployee x1 = new CommissionEmployee();
//        x1.displayCommissionEmployee();// the toString() is overridden in CommissionEmp
//        x1.setEmpID(12351);
//        x1.setEmpName("CEKEnny1");
//        x1.setTotalSales(34512);
//        x1.displayCommissionEmployee();
//        
//        System.out.println("\n======= Constructor 3");
//        CommissionEmployee x2 = new CommissionEmployee("CEKenny2", 765345);
//        x2.displayCommissionEmployee();// the toString() is overridden in CommissionEmp
//        x2.setTotalSales(5412);
//        x2.displayCommissionEmployee();
//        
//        System.out.println("\n======= Constructor 4");
//        Employee xE = new Employee("CEKenny3", 3477823);
//        CommissionEmployee x3 = new CommissionEmployee(345, xE);
//        x3.displayCommissionEmployee();// the toString() is overridden in CommissionEmp
//
//        System.out.println("\n======= Constructor 5");
//        CommissionEmployee x4 = new CommissionEmployee(2313);
//        x4.displayCommissionEmployee();// the toString() is overridden in CommissionEmp   
//        x4.setEmpID(12351);
//        x4.setEmpName("CEKEnny4");
//        x4.displayCommissionEmployee();
//        
//       
//        
//        System.out.println("\n============ BASED PLUS COMMISSION EMPLOYEE ============\n");  
//        System.out.println("======= Constructor 1");
//        BasedPlusCommissionEmployee y = new BasedPlusCommissionEmployee(1342, 253,"BPCEKenny", 230003);
//        y.displayBasedPEmployee();
//        
//        System.out.println("\n======= Constructor 2");
//        BasedPlusCommissionEmployee y1 = new BasedPlusCommissionEmployee();
//        y1.displayBasedPEmployee();
//        y1.setEmpID(12351);
//        y1.setEmpName("BPCEKEnny1");
//        y1.setTotalSales(34512);
//        y1.displayBasedPEmployee();
//        
//        System.out.println("\n======= Constructor 3");
//        BasedPlusCommissionEmployee y2 = new BasedPlusCommissionEmployee("BPCEKenny2", 765345);
//        y2.displayBasedPEmployee();
//        y2.setTotalSales(5412);
//        y2.displayBasedPEmployee();
//        
//        System.out.println("\n======= Constructor 4");
//        Employee yE = new Employee("BPCEKenny3", 77823);
//        BasedPlusCommissionEmployee y3 = new BasedPlusCommissionEmployee(123, 345, yE);
//        y3.displayBasedPEmployee();
//        
//        System.out.println("\n======= Constructor 5");
//        BasedPlusCommissionEmployee y4 = new BasedPlusCommissionEmployee(21356, 2313);
//        y4.displayBasedPEmployee();// the toString() is overridden in CommissionEmp   
//        y4.setEmpID(65351);
//        y4.setEmpName("BPCEKEnny4");
//        y4.displayBasedPEmployee();
//        
//        
//        
//        
//        System.out.println("\n============ HOURLY EMPLOYEE ============\n");  
//        System.out.println("======= Constructor 1");
//        HourlyEmployee w = new HourlyEmployee(152, 600, "HEKenny", 231251);
//        w.displayHourlyEmployee();
//        
//        System.out.println("======= Constructor 2");
//        Employee wE = new Employee("HEKenny1", 3413);
//        HourlyEmployee w1 = new HourlyEmployee(wE);
//        w1.displayHourlyEmployee();
//        w1.setRatePerHour(2443);
//        w1.setTotalHoursWorked(315);
//        w1.displayHourlyEmployee();
//        
//        System.out.println("======= Constructor 3");
//        HourlyEmployee w2 = new HourlyEmployee();
//        w2.displayHourlyEmployee();
//        w2.setRatePerHour(4143);
//        w2.setTotalHoursWorked(65);
//        w2.setEmpID(342);
//        w2.setEmpName("HEKenny2");
//        w2.displayHourlyEmployee();
//        
//        System.out.println("======= Constructor 4");
//        HourlyEmployee w3 = new HourlyEmployee(5122, 2134);
//        w3.displayHourlyEmployee();
//        w2.setEmpID(45322);
//        w2.setEmpName("HEKenny3");
//        w2.displayHourlyEmployee();
//        
//        System.out.println("======= Constructor 5");
//        Employee wE1 = new Employee("HEKenny4", 4613);
//        HourlyEmployee w4 = new HourlyEmployee(2412, 231, wE1);
//        w4.displayHourlyEmployee();
//        
//        
//        
//        
//        System.out.println("\n============ PIECE WORK EMPLOYEE ============\n");  
//        System.out.println("======= Constructor 1");
//        PieceWorkEmployee z = new PieceWorkEmployee(543, 431, "PWEKenny", 1254321);
//        z.displayPWEmployee();
//        
//        System.out.println("======= Constructor 2");
//        Employee zE = new Employee("PWEKenny1", 3413);
//        PieceWorkEmployee z1 = new PieceWorkEmployee(zE);
//        z1.displayPWEmployee();
//        z1.setRatePerPiece(341);
//        z1.setTotalPiecesFinished(34);
//        z1.displayPWEmployee();
//
//        System.out.println("======= Constructor 3");
//        PieceWorkEmployee z2 = new PieceWorkEmployee();
//        z2.displayPWEmployee();
//        z2.setRatePerPiece(4231);
//        z2.setTotalPiecesFinished(134);
//        z2.setEmpID(341);
//        z2.setEmpName("PWEKenny2");
//        z2.displayPWEmployee();
//        
//        System.out.println("======= Constructor 4");
//        PieceWorkEmployee z3 = new PieceWorkEmployee(1457, 457);
//        z3.displayPWEmployee();
//        z3.setEmpID(11341);
//        z3.setEmpName("PWEKenny3");
//        z3.displayPWEmployee();
//        
//        System.out.println("======= Constructor 5");
//        Employee zE1 = new Employee("PWEKenny4", 11313);
//        PieceWorkEmployee z4 = new PieceWorkEmployee(231, 352,zE1);
//        z4.displayPWEmployee();
//
//    }
//}
//}
