@echo off
if [%1] == [] goto error
java -cp .;classes;lib\eif203.jar eif203.labs.permutate.TestAll %2 > %1
goto end
:error
echo Provide an output file as parameter
:end
