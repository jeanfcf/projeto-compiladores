export CLASSPATH=antlr.jar:.
java -jar antlr.jar -package tablegen -o tablegen tableGen.g4
javac *.java tablegen/*.java
time java Main 