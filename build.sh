#!/bin/bash

cd src/main

find . -iname *.java > files.txt

# build class files
javac @files.txt

rm files.txt

find . -iname *.class > files.txt

# package jar file
jar -cf ../../conversions.jar @files.txt

cd ../..
bash clean.sh
