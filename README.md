WebServices
==

Descrição
--
Exercício realizado para a disciplina de Sistemas Distribuídos no período de 2014.1 pela UFAL - Universidade Federal de Alagoas.

Etapas
--
  1. Atualização do Glassfish Server 4 (que foi utilizado no exercício);
```sh
cd /Applications/NetBeans/glassfish-4.0/bin/
./updatetool
```
  2. Criação de um projeto Java Web no Netbeans;
  3. Criação da classe HelloWorldResource no projeto;
  4. Adição do código fonte à classe HelloWorldResource;
```java
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorldResource {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Hello World";
    }
}
```
  5. Adição do arquivo *web.xml*;
  6. Edição do código XML para adicionar um servlet;
```xml
<servlet>
    <servlet-name>Jersey Web Application</servlet-name>
    <servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
    <init-param>
        <param-name>com.sun.jersey.config.property.packages</param-name>
        <param-value>com.sun.jersey.samples.helloworld.resources</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
</servlet>
<servlet-mapping>
    <servlet-name>Jersey Web Application</servlet-name>
    <url-pattern>/*</url-pattern>
</servlet-mapping>
```
  7. Tentar rodar, **but...** Não deu...

