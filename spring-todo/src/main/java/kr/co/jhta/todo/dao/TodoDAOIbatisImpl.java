package kr.co.jhta.todo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.todo.vo.Todo;
import kr.co.jhta.todo.vo.User;

@SuppressWarnings("deprecation")
@Repository
public class TodoDAOIbatisImpl implements TodoDAO{
	
	@Autowired
	private SqlMapClientTemplate template;
	
	@Override
	public void addTodo(Todo todo) {
		template.insert("addTodo", todo);
		
	}
	
	@Override
	public List<Todo> getTodoListByUserNo(int userNo) {
		return template.queryForList("getTodoListByUserNo", userNo);
	}

	@Override
	public Todo getTodoByNo(int no) {
		return (Todo)template.queryForObject("getTodoByNo",no);
	}

	@Override
	public void completeTodoByNo(int no) {
		template.update("completeTodoByNo",no);
	}
	
	
}
