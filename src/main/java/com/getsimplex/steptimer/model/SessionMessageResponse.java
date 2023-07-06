//© 2021 cameron Murdock

package com.getsimplex.steptimer.model;

import org.eclipse.jetty.websocket.api.Session;

/**
 * Created by cameron on 8/16/2016.
 */
public class SessionMessageResponse {

    public Session session;
    public String message;
    public String messageType;
    public ValidationResponse validationResponse;
}
