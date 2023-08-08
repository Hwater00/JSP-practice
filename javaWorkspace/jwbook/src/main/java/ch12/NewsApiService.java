package ch12;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ch10.News;
import ch10.NewsDAO;

@Path("/news")
public class NewsApiService {
	NewsDAO dao;
	
	public NewsApiService() {
		dao = new NewsDAO();
	}
	
	//등록은 auto impo로 id값 필요없음
	@POST
	@Consumes(MediaType.APPLICATION_JSON) //@Consumes란? 보낼 때 타입형식을 결정하는 것으로 미디어타입 모듈의  JSON 형식으로 지정 
	public String addNews(News news) {
		try {
			dao.addNews(news);
		}catch(Exception e) {
			e.printStackTrace();
			return"API 등록 실패";
		}
		return"API 등록 성공" ;
	}

	 @DELETE
	    @Path("/{aid}") //  @Path("/{aid}")  특정 값 지정 시
	    public String delNews(@PathParam("aid") int aid) {
	        try {
	            dao.delNews(aid);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "삭제 실패";
	        }
	        return "삭제 성공";
	    }
	 
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<News> getNews(){
		List<News> newsList = null;
		
		try {
			newsList = dao.getAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return newsList;
	}
	
	
	@GET
	@Path("{aid}") 
	@Produces(MediaType.APPLICATION_JSON)
	public News getNews(@PathParam("aid") int aid) {
		News news = null;
		
		try {
			news = dao.getNews(aid);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return news;
	
	}
}
