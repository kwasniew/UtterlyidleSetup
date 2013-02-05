import com.googlecode.utterlyidle.annotations.GET;
import com.googlecode.utterlyidle.annotations.Path;

public class MainResource {
    @GET
    @Path("/main")
    public String hello() {
        return "<h2>Main Resource</h2>";
    }
}
