/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Department {

    String DeptID;
    String DeptName;
    String DeptLocation;

    public Department(String DeptID, String DeptName, String DeptLocation) {
        this.DeptID = DeptID;
        this.DeptName = DeptName;
        this.DeptLocation = DeptLocation;
    }

    public Department() {
    }

    public String getDeptID() {
        return DeptID;
    }

    public void setDeptID(String DeptID) {
        this.DeptID = DeptID;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getDeptLocation() {
        return DeptLocation;
    }

    public void setDeptLocation(String DeptLocation) {
        this.DeptLocation = DeptLocation;
    }

    public void getDeptInfor() {
        System.out.println(
                this.DeptID + " - " +
                this.DeptName + " - " +
                this.DeptLocation);
    }
}
