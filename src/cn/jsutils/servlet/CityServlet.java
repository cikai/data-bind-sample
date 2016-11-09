package cn.jsutils.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CityServlet extends HttpServlet {
  private static final long serialVersionUID = -9034290525015804258L;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    try {

      String cities = "{\"configs\":[{\"province_id\":26,\"province_name\":\"辽宁\",\"province_short_name\":\"辽\",\"province_pinyin\":\"liaoning\",\"citys\":[{\"city_id\":310,\"city_name\":\"沈阳\",\"city_pinyin\":\"shenyang\",\"city_code\":210100,\"car_head\":\"辽A\",\"engine_num\":6,\"body_num\":6},{\"city_id\":311,\"city_name\":\"大连\",\"city_pinyin\":\"dalian\",\"city_code\":210200,\"car_head\":\"辽B\",\"engine_num\":0,\"body_num\":4},{\"city_id\":313,\"city_name\":\"丹东\",\"city_pinyin\":\"dandong\",\"city_code\":210600,\"car_head\":\"辽F\",\"engine_num\":0,\"body_num\":4},{\"city_id\":314,\"city_name\":\"锦州\",\"city_pinyin\":\"jinzhou\",\"city_code\":210700,\"car_head\":\"辽G\",\"engine_num\":0,\"body_num\":6},{\"city_id\":316,\"city_name\":\"营口\",\"city_pinyin\":\"yingkou\",\"city_code\":210800,\"car_head\":\"辽H\",\"engine_num\":6,\"body_num\":6},{\"city_id\":318,\"city_name\":\"阜新\",\"city_pinyin\":\"fuxin\",\"city_code\":210900,\"car_head\":\"辽J\",\"engine_num\":-1,\"body_num\":-1},{\"city_id\":335,\"city_name\":\"朝阳\",\"city_pinyin\":\"chaoyang\",\"city_code\":211300,\"car_head\":\"辽N\",\"engine_num\":0,\"body_num\":0}]}]}";
      response.setContentType("application/json");
      response.setCharacterEncoding("UTF-8");
      response.setHeader("Access-Control-Allow-Origin", "*");
      response.getWriter().print(cities);
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
