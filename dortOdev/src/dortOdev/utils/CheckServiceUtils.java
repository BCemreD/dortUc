package dortOdev.utils;
import dortOdev.interfaces.Result;

public class CheckServiceUtils {
	public static Result runCheckServices(Result[] customerCheckServices) {
		for (Result customerCheckService : customerCheckServices) {
			if(!customerCheckService.isSuccess()) {
				return customerCheckService;
			}
		}
		return new dortOdev.utils.Result(true);
	}
}
