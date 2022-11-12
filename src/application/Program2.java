package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        /* COMENTANDO PARA NÃO INSERIR UM NOVO DEPARTAMENTO A CADA TESTE */


        System.out.println("*** TEST 1: insert new department ***");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        System.out.println("New department succesfully inserted!!");
        System.out.println("\n*** TEST 2: update a department ***");
        Department department = new Department(5, "Games");
        departmentDao.update(department);
        System.out.println("Department " + department.getId() + " succesfully updated!");

        System.out.println("\n*** TEST 3: delete a department ***");
        System.out.println("Insert the department's Id to delete");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Department deleted");


        System.out.println("\n*** TEST 4: find a department by Id ***");
        System.out.println("Insert the department's Id to search");
        id = sc.nextInt();
        department = departmentDao.findById(id);
        System.out.println(department);




    }

}
