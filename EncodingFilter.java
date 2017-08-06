package cn.mldn.lxh.demo;
import java.io.*;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.*;
public class EncodingFilter implements Filter {
   private String charset ;
   public void init(FilterConfig config)throws ServletException{
	   this.charset=config.getInitParameter("charset");
   }
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(this.charset);
	}
    public void destory() {
    	
    }
	

}
