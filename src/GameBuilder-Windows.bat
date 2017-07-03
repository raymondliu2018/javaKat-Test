@echo off
title GameBuilder
md GAME_TITLE
javac -cp javaKat.jar workspace/*.java
jar cfvm GAME_TITLE.jar Manifest.txt javaKat.jar workspace/*.class images/* sounds/*
move GAME_TITLE.jar GAME_TITLE
copy javaKat.jar GAME_TITLE
cd GAME_TITLE
attrib +h javaKat.jar
pause
