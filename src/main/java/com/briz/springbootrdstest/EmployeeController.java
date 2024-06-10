package com.briz.springbootrdstest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/test")
public String test()
{
	return "this is rrds test";
}
@RequestMapping("/save")
public Employee save(@RequestBody Employee employee)
{
	return erepo.save(employee);
}
@RequestMapping("/all")
public List<Employee> all()
{
	return erepo.findAll();
}
@RequestMapping("/{id}")
public Optional<Employee> byid(@PathVariable int id)
{
	return erepo.findById(id);
}
}
