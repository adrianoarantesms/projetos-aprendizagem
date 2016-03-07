1 - Configure a sua base de dados MySQL ou outros tipos de banco no arquivo de configurações do Spring servlet-context.xml localizado em src/webapp/WEB-INF/spring
2 - Crie a estrutura de tabelas no banco de dados por meo do arquivo script.sql
3 - Execute o arquivo run.sh se estiver no linux ou  run.bat se estiver no windows. Será chamado o Maven por meio do comando mvn package cargo:run que irá baixar o servidor de aplicação Tomcat da Apache e executar o aplicação.

Observação: Você pode utilizar seu próprio servidor web. 