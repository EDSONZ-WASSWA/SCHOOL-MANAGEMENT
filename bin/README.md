Step-by-Step Execution Guide:

Database Setup:

bash
mysql -u root -p < src/main/resources/sql/setup.sql
Build Application:

bash
mvn clean package
Run Application:

bash
java -jar target/nursing-management-system.jar
To Create Shareware/Executable:

Add Maven plugin for creating fat jar: