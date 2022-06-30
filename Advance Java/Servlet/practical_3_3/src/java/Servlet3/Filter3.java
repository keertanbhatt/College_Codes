package Servlet3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Filter3 implements Filter {

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String password = req.getParameter("password");
        if (password.equals("misfit")) {
            chain.doFilter(req, resp);//sends request to next resource
        } else {
            out.print("username or password error!");
            RequestDispatcher rd = req.getRequestDispatcher("index3.html");
            rd.include(req, resp);
        }
    }

    @Override
    public void destroy() {
    }

}
