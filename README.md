===============================================
[windows git MINGW64]
===============================================

https://git-scm.com/download/win  

>> download : 64-bit Git for Windows Setup.

>> install >> MINGW64(cmd.exe) >> finish

Open MINGW64(cmd.exe)  >>


git --version


cd /c/IOTstudy/javaProject/


ls -al


echo "#java source" >> README.md


ls


git add README.md


git init


git add *


git status


git config --global user.email "rf00000@naver.com"


git config --global user.name "edu1004"


git commit -m "first commit"


git remote add origin https://github.com/edu1004/javaPro.git


git push -u origin master

git add *


git status


git commit -m "second commit"


git push -u javaPro master
