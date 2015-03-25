@echo off
@title Novak's Development - v144.3 - RED - Zero
Color 0A
set CLASSPATH=.;dist\*
java -client -Dwzpath=wz server.Start
pause