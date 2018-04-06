Installing OpenJDK on RHEL-based systems
Configure your operating system to use the OpenJDK 8.

Procedure
In a terminal:

Install the OpenJDK 8:
$ su -c "yum install java-1.8.0-openjdk"
If you have more than one Java version installed on your system use the following command to switch versions:
$ sudo alternatives --config java
Make sure your system is using the correct JDK:
$ java -version
openjdk version "1.8.0_71"
OpenJDK Runtime Environment (build 1.8.0_71-b15)
OpenJDK 64-Bit Server VM (build 25.71-b15, mixed mode)
