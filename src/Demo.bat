@echo OFF

chcp 65001

cd ../
rmdir /s/q build
mkdir build
cd build
mkdir classes
cd ../src

javac -d ../build/classes ua/nure/matsak/task1/Demo.java

java -classpath ../build/classes ua.nure.matsak.task1.Demo



