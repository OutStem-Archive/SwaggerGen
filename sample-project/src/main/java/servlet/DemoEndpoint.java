package servlet;
import annotation.SwaggerGen;
/**
 * A Fake endpoint for testing.
 * 
 * @author Alexandre Seguin (7663995)
 */
public class DemoEndpoint {


	/**
	 * Fake endpoint for testing purposes
	 * @param request fake request object
	 * @param resp fake response object
	 */
	@SwaggerGen(
		uri="/post",
		basePath="localhost/test",
		method="POST",
		title="Meeting",
		description="Post Servlet Description",
		headers={"Content-Type=application/json", "langHeader=en"},
		body="schemas/all/meetingPost.json",
		responses={"200=OK", "400", "404", "401", "403"},
		scheme="HTTP"
	)
	public void doPost(Object request, Object resp) {
		RequestHandler.handle(request);
		ResponseHandler.handle(resp);
	}
	
	@SwaggerGen(
			uri= "/put",
			basePath="localhost/test",
			method="PUT",
			title="Meeting",
			description="This is a sample PUT endpoint description to be printed in a Swagger format HTML documentation file.",
			headers={"Content-Type=application/json", "authorization=token used for authorization", "langHeader=expected language of the request"},
			body="schemas/all/meetingPut.json",
			responses={"200=OK", "400", "404", "401", "403"},
			scheme="HTTP"
		)
	public void doPut(Object request, Object resp) {
		RequestHandler.handle(request);
		ResponseHandler.handle(resp);
	}
	
	/**
	 * Fake endpoint for testing purposes
	 * @param request fake request object
	 * @param resp fake response object
	 */
	@SwaggerGen(
		uri="/get",
		basePath="localhost/test",
		method="GET",
		title="Meeting",
		description="This is a sample GET endpoint description to be printed in a Swagger format HTML documentation file.",
		headers={"Content-Type=application/json", "authorization=authorization token", "langHeader=expected language of the request"},
		queryParams={
				"i meeting_id = id of the meeting being requested",
				"b detailed = boolean determining whether to get extra meeting information ",
				"meeting_minutes = notes taken during the meeting",
				},
		responses={"200=OK", "400", "404", "401", "403"},
		scheme="HTTP"
	)
	public void doGet(Object request, Object resp) {
		RequestHandler.handle(request);
		ResponseHandler.handle(resp);
	}
}
