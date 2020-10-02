package io.quarkus.workshop.superheroes.hero;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
    info = @Info(title = "Hero API",
        description = "This API allows CRUD operations on a hero",
        version = "1.0",
        contact = @Contact(name = "Quarkus", url = "https://github.com/ocp4labs/do292/tree/master/chapter_quarkus")),
    servers = {
        @Server(url = "https://routell7t02hd-anademcz-che.8a09.starter-us-east-2.openshiftapps.com")
    },
    externalDocs = @ExternalDocumentation(url = "https://github.com/ocp4labs/do292/tree/master/chapter_quarkus", description = "All the Quarkus workshops"),
    tags = {
        @Tag(name = "api", description = "Public that can be used by anybody"),
        @Tag(name = "heroes", description = "Anybody interested in heroes")
    }
)
public class HeroApplication extends Application {
}
