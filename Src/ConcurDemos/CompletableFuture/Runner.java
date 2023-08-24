import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Runner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.SECONDS.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "First Part";
		}).thenApply(data -> {
		    return "Second part using " + data;
		}).thenApply(data2 -> {
		    return data2 + ", With some more stuff added on.";
		});

		System.out.println(welcomeText.get());
	
		
	}

}
