package com.sfl.overheid.api.configuration;

import javax.ws.rs.client.Client;

/**
 * User: Arthur Asatryan
 * Company: SFL LLC
 * Date: 10/5/16
 * Time: 11:35 AM
 */
public interface OverheidJerseyClientBuilder {
    Client build();
}