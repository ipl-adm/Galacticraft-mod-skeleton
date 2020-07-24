#!/bin/bash
cd ~
wget https://services.gradle.org/distributions/gradle-4.9-bin.zip
unzip gradle-4.9-bin.zip
rm -f gradle-4.9-bin.zip

echo 'GRADLE_HOME=~/gradle-4.9' >> ~/.profile
echo 'PATH=$GRADLE_HOME/bin:$PATH' >> ~/.profile
source ~/.profile