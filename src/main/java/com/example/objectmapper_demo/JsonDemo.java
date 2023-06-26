package com.example.objectmapper_demo;

import com.example.objectmapper_demo.entity.Employee;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonDemo {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
//        Employee employee=new Employee(1,"John","John@gmail.com",10000);
//        try{
//            objectMapper.writeValue(new File("target/employee.json"),employee);
//        }catch (final Exception e){
//            e.printStackTrace();
//        }
       String employeeJson = "{\"id\":1,\"name\":\"John\",\"email\":\"John@gmail.com\",\"salary\":10000}";
//        try {
//            Employee employee = objectMapper.readValue(employeeJson, Employee.class);
//            System.out.println(employee.getEmail());
//
//        } catch (final Exception e) {
//            e.printStackTrace();
//        }
//    }
        try {
            JsonNode jsonNode = objectMapper.readTree(employeeJson);
            System.out.println(jsonNode.get("name").asText());

        } catch (final Exception e) {
            e.printStackTrace();
        }

    }
}
