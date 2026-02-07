package tlmi.service.client;

import ac4y.service.adapter.Ac4yRestServiceClient;
import com.google.gson.Gson;
import tlmi.service.domain.Text2TextRequest;
import tlmi.service.domain.Text2TextResponse;

import java.io.IOException;

public class TlmiServiceClient {

    public TlmiServiceClient(String host) {
        this.setHost(host);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    protected String host;


    public Text2TextResponse text2text(Text2TextRequest request) {

        try {
            return (Text2TextResponse) new Gson().fromJson(
                    new Ac4yRestServiceClient().request(this.getHost()+"/translating/text2text/","POST", request.getAsJson())
                    ,Text2TextResponse.class
            );
        } catch (IOException exception) {
            return (Text2TextResponse) new Text2TextResponse().error(new Ac4yRestServiceClient().getStackTraceAsString(exception));
        }

    } // text2text

} // TlmiServiceClient
