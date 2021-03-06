package com.mushfiqur.rahman.todos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddTodoServlet
 */
@WebServlet("/AddTodoServlet")
public class AddTodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String newTodo = request.getParameter("todo");
		todoService.addTodo(new Todo(newTodo));
		response.sendRedirect("/todo.do");
	}
}