1. Required files

Copy the Postgres JDBC jar to $CATALINA_HOME/lib. As with Oracle, the jars need to be in this directory in order for DBCP's Classloader to find them. This has to be done regardless of which configuration step you take next.

2. Resource configuration

You have two choices here: define a datasource that is shared across all Tomcat applications, or define a datasource specifically for one application.

2a. Shared resource configuration
....
	
2b. Application-specific resource configuration

Use this option if you wish to define a datasource specific to your application, not visible to other Tomcat applications.
This method is less invasive to your Tomcat installation.

Create a resource definition for your Context (http://tomcat.apache.org/tomcat-6.0-doc/config/context.html).
The Context element should look something like the following.

		Individual Context elements may be explicitly defined:

In an individual file at /META-INF/context.xml inside the application files. 
In Tomcat 6 this file is automatically copied to $CATALINA_BASE/conf/[enginename]/[hostname]/ and renamed to 
application's base file name plus a ".xml" extension. (This automated copying became optional in Tomcat 7).
	
<Context>

<Resource name="jdbc/postgres" auth="Container"
          type="javax.sql.DataSource" driverClassName="org.postgresql.Driver"
          url="jdbc:postgresql://127.0.0.1:5432/mydb"
          username="myuser" password="mypasswd" maxActive="20" maxIdle="10"
maxWait="-1"/>
</Context>

		
3. web.xml configuration

		
	
<resource-ref>
 <description>postgreSQL Datasource example</description>
 <res-ref-name>jdbc/postgres</res-ref-name>
 <res-type>javax.sql.DataSource</res-type>
 <res-auth>Container</res-auth>
</resource-ref>

		
4. Accessing the datasource

When accessing the datasource programmatically, remember to prepend java:/comp/env to your JNDI lookup, as in the following snippet of code. Note also that "jdbc/postgres" can be replaced with any value you prefer, provided you change it in the above resource definition file as well.

		
	
InitialContext cxt = new InitialContext();
if ( cxt == null ) {
   throw new Exception("Uh oh -- no context!");
}

DataSource ds = (DataSource) cxt.lookup( "java:/comp/env/jdbc/postgres" );

if ( ds == null ) {
   throw new Exception("Data source not found!");
}