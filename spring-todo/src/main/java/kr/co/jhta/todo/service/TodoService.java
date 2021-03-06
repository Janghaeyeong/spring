package kr.co.jhta.todo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import kr.co.jhta.todo.vo.Todo;
@Transactional
public interface TodoService {
	
	void registerTodo(Todo todo);
	
	List<Todo> getTodoList(int no);
	
	void completeTodo(int no, int userNo);

	String getAttachFilename(int no, int userNo);
}
