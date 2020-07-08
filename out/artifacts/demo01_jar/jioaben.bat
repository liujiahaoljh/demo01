@echo off 
start D:\2019ideaworkspace\demo01\out\artifacts\demo01_jar\demo01.bat
:begin
echo Wscript.Sleep Wscript.Arguments(0) * 1000>Delay.vbs 
echo 等待30秒..... 
Delay.vbs 30 :: 30秒后后打开D盘下的demo02.bat
start D:\2019ideaworkspace\demo01\out\artifacts\demo01_jar\demo02.bat
exit
goto begin