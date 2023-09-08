package com.erplogic.sap.apis;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class SoapConnection {
    public static final String AUTHORIZATION_TYPE = "Basic";

    private final String url;
    private final String userName;
    private final String password;
    private final Class<?> serviceClass;

    /**
     * @param url
     * @param userName
     * @param password
     * @param serviceClass
     */
    public SoapConnection(final String url, final String userName, final String password, final Class<?> serviceClass) {
        super();
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.serviceClass = serviceClass;
    }

    public JaxWsProxyFactoryBean getFactoryBean() {

        final JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress(this.url);
        factoryBean.setServiceClass(this.serviceClass);

        return factoryBean;

    }

    public void connect(final Object o) {
        // Configure the HTTP conduit with username and password
        final org.apache.cxf.endpoint.Client clientProxy = org.apache.cxf.frontend.ClientProxy.getClient(o);
        final org.apache.cxf.transport.http.HTTPConduit conduit = (org.apache.cxf.transport.http.HTTPConduit) clientProxy
            .getConduit();

        final AuthorizationPolicy authPolicy = new AuthorizationPolicy();
        authPolicy.setAuthorizationType(AUTHORIZATION_TYPE);
        authPolicy.setUserName(this.userName);
        authPolicy.setPassword(this.password);
        conduit.setAuthorization(authPolicy);
    }
}
