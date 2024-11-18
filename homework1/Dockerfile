FROM openjdk:22
LABEL authors="Ser-An-Pol"
COPY ./src ./src
RUN javac -d ./test-culc -sourcepath ./src/ ./src/ru/seranpol/Main.java
RUN javadoc -d ./test-culc/docs/ -sourcepath ./src -cp ./test-culc/ -subpackages ru
RUN java -cp ./test-culc/ ru.seranpol.Main | tee ./test-culc/output.txt

#docker cp [ID контейнера]:./test-culc ./test-culc
