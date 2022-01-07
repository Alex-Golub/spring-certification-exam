package com.spring.professional.exam.tutorial.module05.question09.controller;

import com.spring.professional.exam.tutorial.module05.question09.utils.JoinUtils;
import org.apache.catalina.connector.RequestFacade;
import org.apache.catalina.connector.ResponseFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.IOException;

@Controller
public class Example02NativeWebRequest {
  // curl "localhost:8080/actionB?name=John&country=US"
  @GetMapping("/actionB")
  @ResponseBody
  public void actionB(NativeWebRequest nativeWebRequest) throws IOException {
    RequestFacade requestFacade = nativeWebRequest.getNativeRequest(RequestFacade.class);
    ResponseFacade responseFacade = nativeWebRequest.getNativeResponse(ResponseFacade.class);

    if (requestFacade == null || responseFacade == null) {
      return;
    }

    responseFacade.getOutputStream().println(
            String.format(
                    "Retrieved request with headers = [%s], parameters = [%s]",
                    JoinUtils.join(requestFacade.getHeaderNames()),
                    JoinUtils.join(requestFacade.getParameterNames())
            )
    );
  }
}
