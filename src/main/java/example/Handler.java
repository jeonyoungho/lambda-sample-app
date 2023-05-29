package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

/**
 * Created by jyh1004 on 2023-05-29
 */

public class Handler implements RequestHandler<Map<String, String>, Void> {
    @Override
    public Void handleRequest(Map<String, String> event, Context context) {
        LambdaLogger lambdaLogger = context.getLogger();
        lambdaLogger.log("Invoke successfully!!! Event Type => " + event.getClass());

        return null;
    }
}
