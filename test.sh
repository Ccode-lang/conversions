rm conversions.jar
echo "Building and running tests"
bash build.sh

java -cp conversions.jar com.ccode.tests.test