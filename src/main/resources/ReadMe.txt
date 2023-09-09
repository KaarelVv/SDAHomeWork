

1.To run the application, recommended environment is IntelliJ Ultimate. But before to run the project, connection to the
  database needs to be made.

2.To connect to a database you need to use postgres as this project is set up using provided management system.
  Creating database can be done manually using pgAdmin or intelliJ.
  To establish connection, open database tab and find the correct database source and then provide needed connection values.
  Also, application.properties need to be configured to connect spring with needed database.

    Copy this into the properties file and enter correct values without "".
  spring.datasource.url=jdbc:postgresql://localhost:"database_port"/"database_name"
  spring.datasource.username="database_user"
  spring.datasource.password="database_password"
  spring.jpa.hibernate.ddl-auto=update

  3.To test prototype and singleton beans use test controller, and you preferred client.

