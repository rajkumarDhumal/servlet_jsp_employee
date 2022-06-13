package EMPLOYEE_Servlet_JSP_prc.Controller;

import java.io.IOException;
import java.util.List;

import javax.imageio.IIOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EMPLOYEE_Servlet_JSP_prc.dao.Employee_dao;
import EMPLOYEE_Servlet_JSP_prc.dto.Employee;

@WebServlet("/createemployee")
public class CreateEmployee extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		Long pno=Long.parseLong(req.getParameter("pno"));
		
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setPno(pno);
		
		Employee_dao dao=new Employee_dao();
		dao.insertEmployee(employee);
		String message="Inserted ";
		req.setAttribute("message", message);
		RequestDispatcher dispatcher=req.getRequestDispatcher("CreateEmployee.jsp");
		dispatcher.forward(req, resp);
		
	}
//	@WebServlet("/getemp")
//	public class GetEmployee extends HttpServlet {
//		@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			int id=Integer.parseInt(req.getParameter("id"));
//			Employee_Dao dao=new Employee_Dao();
//			Employee employee= dao.getEmployeeById(id);
//			
//			req.setAttribute("employee", employee);
//			RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateEmployee.jsp");
//			dispatcher.forward(req, resp);
//		}
//
//	}

	
//	@WebServlet("/viewEmployee")
//	public class ViewEmployee extends HttpServlet {
//		
//		@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			
//			Employee_Dao dao=new Employee_Dao();
//			List<Employee> employees=dao.getAllEmployees();
//			
//			req.setAttribute("employees", employees);
//			RequestDispatcher dispatcher=req.getRequestDispatcher("ViewEmployee.jsp");
//			dispatcher.forward(req, resp);
//		}
//
//	}
	
//	@WebServlet("/Updateemployee")
//	public class UpdateEmployee extends HttpServlet {
//
//		@Override
//		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			int id=Integer.parseInt(req.getParameter("id"));
//			String name = req.getParameter("name");
//			String address = req.getParameter("address");
//			long phone = Long.parseLong(req.getParameter("phone"));
//			String email = req.getParameter("email");
//			String pwd = req.getParameter("pwd");
//			String role = req.getParameter("role");
//			String dept = req.getParameter("dept");
//			String Manager = req.getParameter("manager");
//
//			Employee employee = new Employee();
//			employee.setId(id);
//			employee.setName(name);
//			employee.setAddress(address);
//			employee.setPhone(phone);
//			employee.setEmail(email);
//			employee.setPassword(pwd);
//			employee.setRole(role);
//			employee.setDept(dept);
//			employee.setManager(Manager);
//
//			Employee_Dao dao = new Employee_Dao();
//			if (dao.UpdateEmployee(employee)) {
//				String message = "Updated Employee";
//				req.setAttribute("message1", message);
//				RequestDispatcher dispatcher = req.getRequestDispatcher("viewEmployee");
//				dispatcher.forward(req, resp);
//
//			} else {
//				String message = "Not Inserted Employee";
//				req.setAttribute("message1", message);
//				RequestDispatcher dispatcher = req.getRequestDispatcher("viewEmployee");
//				dispatcher.forward(req, resp);
//			}
//		}
}
