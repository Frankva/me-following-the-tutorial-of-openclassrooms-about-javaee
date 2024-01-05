all: servelets shutdown start

servelets: WEB-INF/classes/servelets/*.class
WEB-INF/classes/servelets/*.class: beans WEB-INF/classes/servelets/*.java 
	javac -classpath '../../lib/*;WEB-INF/classes/' 'WEB-INF/classes/servelets/*.java' 

beans: WEB-INF/classes/beans/*.class
WEB-INF/classes/beans/*.class: WEB-INF/classes/beans/*.java
	javac 'WEB-INF/classes/beans/*.java' 


shutdown:
	powershell ../../bin/shutdown.bat
start:
	powershell ../../bin/startup.bat

clear:
	clear
.PHONY: start shutdown clear
