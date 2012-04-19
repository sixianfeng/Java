import javax.servlet.http.HttpServlet;



public abstract class AbstractHttpServlet extends HttpServlet {
	
	public void init()
	{
		configure();
	}
	protected abstract void configure();
	

}
