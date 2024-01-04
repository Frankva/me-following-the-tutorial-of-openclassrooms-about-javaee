WEB-INF/classes/*.class: WEB-INF/classes/*.java shutdown start
	javac -classpath '../../lib/*' 'WEB-INF/classes/*.java' 

shutdown:
	powershell ../../bin/shutdown.bat
start:
	powershell ../../bin/startup.bat

.PHONY: start shutdown
