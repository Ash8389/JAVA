module com.jersey.JerseyApi.module {
    requires jakarta.ws.rs;

    requires org.glassfish.jersey.container.servlet;
    requires org.glassfish.jersey.inject.hk2;
    requires transitive jakarta.persistence;
    requires transitive jakarta.xml.bind;

    opens com.jersey.JerseyApi;

    exports com.jersey.JerseyApi;
}