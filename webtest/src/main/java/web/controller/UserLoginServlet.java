package web.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import web.bean.User;
import web.mapper.UserMapper;
import web.util.sqlsessionutil;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @projectName: spring
 * @package: web.controller
 * @className: UserLoginServlet
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/26 10:46
 * @version: 1.0
 */
@WebServlet({"/login","/detail"})
public class UserLoginServlet extends HttpServlet{
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String servletPath = request.getServletPath();
        if("/login".equals(servletPath)){
            dologin(request,response);
        }
        HttpSession session = request.getSession();
        if(session.getAttribute("username")!=null&&session!=null){
            if("/detail".equals(servletPath)){
                dodetail(request,response);
            }
        }
    }

    private void dodetail(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
        User user = applicationContext.getBean("user", User.class);
        user.setUsername(username);
        user.setPassword(password);
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int insert = mapper.insert(user);
        if(insert==1){
            sqlSession.commit();
            out.print("注册成功");
            sqlsessionutil.close(sqlSession);
        }else{
            out.print("注册失败");
        }
    }

    private void dologin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        SqlSession sqlSession = sqlsessionutil.opensession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        if(mapper.select(username,password)!=null){
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            response.sendRedirect("register.jsp");
        }else {
            out.print("登录失败");
        }
    }
}
