package com.softeam.employees.mappers;

import com.softeam.employees.dto.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

/**
 * Created by elkouhen on 05/06/16.
 */
public interface EmployeeMapper {

	@Select("SELECT * FROM employee WHERE id = #{id}")
    Employee findEmployeeById(@Param("id") String userId);

    @Select("SELECT * FROM employee")
    Collection<Employee> findEmployees();

    @Insert("INSERT INTO employee(lastname, firstname) VALUES (#{lastname}, #{firstname})")
    void insertEmployee(Employee e);
}
