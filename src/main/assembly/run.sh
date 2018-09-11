#!/bin/sh

DIR=`dirname $0`
cd $DIR
nohup java -Dloader.path=libs -Xms4096M -Xmx4096M -XX:PermSize=128M -XX:MaxPermSize=256M -jar `ls | grep jar` > /dev/null 2>&1 &