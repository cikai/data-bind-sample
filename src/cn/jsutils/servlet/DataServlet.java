package cn.jsutils.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.jsutils.model.DataModel;

public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = -9034290525015804258L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			long timestamp = System.currentTimeMillis();
			DataModel dm = new DataModel();
			dm.setName("Sun Jiawei");
			dm.setMoney(String.valueOf(timestamp));
			Gson gson = new Gson();
			response.setCharacterEncoding("UTF-8");
			response.getWriter().print(gson.toJson(dm));
			response.getWriter().flush();
			response.getWriter().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			doGet(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
