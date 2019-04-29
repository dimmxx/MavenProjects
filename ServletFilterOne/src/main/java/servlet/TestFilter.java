package servlet;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {

    //http://www.java2ee.ru/servlets/filters.html

    private FilterConfig config = null;
    private boolean active = false;

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
        String act = config.getInitParameter("active");
        if(act != null){
            active = (act.toUpperCase().equals("TRUE"));
        }

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        if(active){
            servletRequest.setAttribute("filter", "filter passed");
        }

        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        config =null;

    }
}
