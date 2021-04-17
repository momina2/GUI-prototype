/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluation;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Ghauri
 */
public class StudentInfo {

    public String Fname;

    public boolean setFname(String fname) {
        boolean flag = false;
        for (int i = 0; i < fname.length(); i++) {
            flag = (fname.charAt(i) >= 'A' && fname.charAt(i) <= 'Z') || (fname.charAt(i) >= 'a' && fname.charAt(i) <= 'z');
            flag = true;
        }
        if (flag = true) {
            Fname = fname;
        }
        return flag;

    }
    public String Lname;

    public boolean setLname(String lname) {
        boolean flag = false;
        for (int i = 0; i < lname.length(); i++) {
            flag = (lname.charAt(i) >= 'A' && lname.charAt(i) <= 'Z') || (lname.charAt(i) >= 'a' && lname.charAt(i) <= 'z');
            flag = true;
        }
//        if (flag = false) {
//            System.out.println("invalid");
//        } 
        if (flag = true) {
            Lname = lname;
        }
        return flag;
    }
    public String Department;

    public boolean setDepartment(String Dep) {
        boolean flag = false;
        for (int i = 0; i < Dep.length(); i++) {
            flag = (Dep.charAt(i) >= 'A' && Dep.charAt(i) <= 'Z') || (Dep.charAt(i) >= 'a' && Dep.charAt(i) <= 'z');
            flag = true;
        }
        if (flag = true) {
            Department = Dep;
        }

        return flag;
    }
    public String RegNo;

    public boolean setRegNo(String Reg) {
        boolean flag = false;
        System.out.print(Reg + Reg.length());
        for (int i = 0; i < 4; i++) {
            if (Reg.charAt(i) >= '0' && Reg.charAt(i) <= '9') {
                flag = true;
            }
        }
        for (int i = 4; i < 5; i++) {

            if (Reg.charAt(i) == '-');
            flag = true;
        }
        for (int i = 5; i < 7; i++) {

            if (Reg.charAt(i) >= 'A' && Reg.charAt(i) <= 'Z');
            flag = true;
        }
        for (int i = 7; i < 8; i++) {

            if (Reg.charAt(i) == '-');
            flag = true;
        }
        for (int i = 8; i < 10; i++) {

            if (Reg.charAt(i) >= '0' && Reg.charAt(i) <= '9');
            flag = true;
        }
        if (flag = true) {
            RegNo = Reg;

        }

        return flag;
    }

}
