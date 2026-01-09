/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.demooop;

import Model.Department;
import Model.PERSON;

/**
 *
 * @author Dell
 */
public class DemoOOP {

    public static void main(String[] args) {
        PERSON Json = new PERSON();
        Json.unique_id = "T001";
        Json.name = "Json";
        Json.gender = "male";
        Json.city = "Đà Nẵng";
        Json.age = 35;
        System.out.println(Json.unique_id + " - "
                + Json.name + " - "
                + Json.gender + " - "
                + Json.city + " - "
                + Json.age + " - ");
        PERSON Lisa = new PERSON("T002", "Lisa", 20, "Hà Nội", "Nữ");
        System.out.println(Lisa.unique_id + " - "
                + Lisa.name + " - "
                + Lisa.gender + " - "
                + Lisa.city + " - "
                + Lisa.age + " - ");
        
        Department IT = new Department();
        IT.setDeptID("IT001");
        IT.setDeptName("Phòng CNTT");
        IT.setDeptLocation("42 Nguyễn Văn Tiết");
        IT.getDeptInfor();
        Department HR = new Department("HR001","Phòng Sinh Sự"
                                ,"42 Nguyễn Văn Tiết");
        HR.getDeptInfor();
    }
}
