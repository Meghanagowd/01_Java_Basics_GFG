#!/bin/bash

echo "Jenkins is running the project"

echo "Listing files in repository"
ls

echo "Compiling Java files"
javac *.java

echo "Running Java program"
java Main
