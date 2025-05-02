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

Add Maven plugin for creating fat jar:Build executable:

bash
mvn assembly:single
Use jpackage to create native installer:

bash
jpackage --input target/ --name NursingManager --main-jar nursing-management-system.jar --main-class com.nursing.management.Main --type app-image
Modern UI Implementation Tips:

Use JavaFX Material Design libraries

Implement CSS gradients for backgrounds

Add animated transitions between views

Use font icons (FontAwesomeFX)

Implement responsive layouts with GridPane and HBox/VBox

Add input validation with color-coded feedback

Use JavaFX Dialog API for modern alerts