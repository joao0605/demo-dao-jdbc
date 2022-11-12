package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main (String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        /* COMENTANDO PARA NÃO INSERIR UM NOVO DEPARTAMENTO A CADA TESTE

        System.out.println("*** TEST 1: insert new department ***");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        System.out.println("New department succesfully inserted!!"); */

        System.out.println("\n*** TEST 2: update a department ***");
        Department department = new Department(5, "Games");
        departmentDao.update(department);
        System.out.println("Department " + department.getId() + " succesfully updated!");
    }
}
