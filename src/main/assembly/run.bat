@echo off
for /r ./ %%i in (*.jar) do java -Dloader.path=libs -jar %%i