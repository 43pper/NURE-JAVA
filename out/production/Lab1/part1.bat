@echo OFF

cd ../
rmdir build
mkdir build
cd build
mkdir classes
cd ../src

javac -d ../build/classes ua/nure/matsak/task1/Part1.java

java -classpath ../build/classes ua.nure.matsak.task1.Part1 30 40 50




