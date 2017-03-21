package kr.co.jhta.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{
	@Override
	public void init(FilterConfig config) throws ServletException {
		
	}
	@Override
	public void destroy() {
		
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterchain)
			throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		filterchain.doFilter(req, res);
		
	}
	
}
