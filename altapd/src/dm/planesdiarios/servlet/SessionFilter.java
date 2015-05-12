package dm.planesdiarios.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter implements Filter {
	FilterConfig config = null;
	public static String AUTENTICADO = "AUTENTICADO";
	public static String LOGIN_VIEW = "/index.jsp";
	
    private ArrayList<String> urlList;
     
    public void destroy() {
    }
 

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		boolean autenticado = false;
		String ipAddress = req.getRemoteAddr();
		System.out.println("IP "+ipAddress + ", Time " + new Date().toString());	
		HttpSession session = req.getSession();
		if(!req.getRequestURI().contains("index.jsp")){
			if (session != null && session.getAttribute("USUARIO_LOGUEADO"+session.getId()) != null) {
				autenticado = true;
			}else{
				request.getRequestDispatcher(LOGIN_VIEW).forward(request, response);
				return;
			}
				
				
		}
		chain.doFilter(req, httpResponse);
    }

	@Override
	public void init(FilterConfig config) throws ServletException {
        String urls = config.getInitParameter("avoid-urls");
        StringTokenizer token = new StringTokenizer(urls, ",");
 
        urlList = new ArrayList<String>();
 
        while (token.hasMoreTokens()) {
            urlList.add(token.nextToken());
 
        }
	}
}