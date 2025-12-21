module com.jersey.JerseyApi.module {
    requires jakarta.ws.rs;

    requires org.glassfish.jersey.container.servlet;
    requires org.glassfish.jersey.inject.hk2;

    exports com.jersey.JerseyApi;
}