package cn.mldn.lxh.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
public class LoginFileter implements Filter{
    
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession ses=req.getSession();
		if(ses.getAttribute("userid")!=null) {
		chain.doFilter(request,response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}
     
}
