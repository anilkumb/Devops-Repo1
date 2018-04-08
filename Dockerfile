FROM httpd:2.4
MAINTAINER anil.bingumalla@gmail.com

#copy files
COPY ./Hello.html /usr/local/apache2/htdocs/

# ExposePorts
EXPOSE 80