@echo off 
start D:\2019ideaworkspace\demo01\out\artifacts\demo01_jar\demo01.bat
:begin
echo Wscript.Sleep Wscript.Arguments(0) * 1000>Delay.vbs 
echo �ȴ�30��..... 
Delay.vbs 30 :: 30�����D���µ�demo02.bat
start D:\2019ideaworkspace\demo01\out\artifacts\demo01_jar\demo02.bat
exit
goto begin