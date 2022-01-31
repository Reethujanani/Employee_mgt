package com.example.Employee.service;

import com.example.Employee.Mgmt.entity.Department;
import com.example.Employee.Mgmt.entity.Employee;
import com.example.Employee.Mgmt.repository.DepartmentRepository;
import com.example.Employee.Mgmt.repository.EmployeeRepository;
import com.example.Employee.Mgmt.service.EmployeeService;
import com.example.Employee.Mgmt.service.serviceImpl.EmployeeServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeServiceImplTest<AzureFileUploadServiceImpl> {

	@InjectMocks
	private EmployeeServiceImpl employeeService;

	@Mock
	private EmployeeRepository employeeRepository;

	@Mock
	private DepartmentRepository departmentRepository;

	@Mock
	private AzureFileUploadServiceImpl azureFileUploadService;
	private Object TestConstants;
	private Object MasterConstants;

	@Before
	void init() {
		when(DepartmentRepository.findById(TestConstants.ID))
				.thenReturn(java.util.Optional.ofNullable(department()));

		when(EmployeeRepository.findById(TestConstants.ID_))
				.thenReturn(java.util.Optional.ofNullable(employee()));
		EmployeeService.setEmployeeRepository(employeeRepository);
		EmployeeService.setEmployeeRepository(employeeRepository);
		EmployeeService.setEmployeeRepository(employeeRepository);
		EmployeeService.setDepartmentRepository(departmentRepository);
		EmployeeService.setAzureFileUploadService(azureFileUploadService);
	}

	private <T> T employee() {
	}

	private <T, SuccessResponse> T department() {


	private Employee employee() {
		Employee employee = new Employee();
		employee.setEmployeeId(TestConstants.EMPLOYEE_ID);
		employee.setFirstName(TestConstants.FIRST_NAME);
		employee.setLastName(TestConstants.LAST_NAME);
		employee.setMobileNo(TestConstants.MOBILE_NO);
		employee.setCity(TestConstants.CITY);
		employee.setIsActive(TestConstants.IS_ACTIVE);
		employee.setIsDeleted(TestConstants.DELETED_FLAG);
		return employee;
	}

	private Department department() {
		Department department1 = new Department();
			department1.setDepartmentId(TestConstants.DEPARTMENT_ID);
			department1.setDepartmentName(TestConstants.DEPARTMENT_NAME);
		return department1;
	}

	@Test
	void saveEmployee() {
		try {
			SuccessResponse successResponse = employeeService.saveUser(userRequest());
			assertEquals(MasterConstants.SUCCESS_MESSAGE, successResponse.getStatusMessage());
		} catch (Exception e) {
		}
	}

	@Test
	void updateemployee() {
		try {
			SuccessResponse successResponse = employeeService.updateUser(userRequest());
			assertEquals(MasterConstants.SUCCESS_MESSAGE, successResponse.getStatusMessage());
		} catch (Exception e) {
		}
	}

	@Test
	void userList() {
		try {
			SuccessResponse successResponse = employeeService.userList(TestConstants.PAGE_NO, TestConstants.PAGE_SIZE, TestConstants.SORT_BY, TestConstants.ORDER, TestConstants.SEARCH);
			assertEquals(MasterConstants.SUCCESS_MESSAGE, successResponse.getStatusMessage());
		} catch (Exception e) {
		}
	}


	@Test
	void employeeList() {
		try {
			SuccessResponse successResponse = employeeService.roleList();
			assertEquals(MasterConstants.SUCCESS_MESSAGE, successResponse.getStatusMessage());
		} catch (Exception e) {
		}
	}

	@Test
	void employeeById() {
		try {
			assertNull(employeeService.EmployeeById(TestConstants.UUID));
		} catch (Exception e) {
		}
	}


	}
}