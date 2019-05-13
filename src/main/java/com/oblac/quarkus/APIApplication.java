package com.oblac.quarkus;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Markup class, just defines the API prefix.
 */
@ApplicationPath("/api")
public class APIApplication extends Application {

}
