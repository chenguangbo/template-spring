FROM tomcat
ENV TZ=Asia/Shanghai
#系统编码
ENV LANG=zh_CN.UTF-8 LC_ALL=zh_CN.utf8
ENV COMPOSE_CONVERT_WINDOWS_PATHS=1
VOLUME /dockerapp/idea/springboot
COPY  target/springboot.war /usr/local/tomcat/webapps/api.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
